package lecture.springbootsecurity.secutiry;

// 2. JWT 토큰 기반 인증 방식
// -- 로그인 성공 > 서버에서 jwt 토큰 발급 > 응답에 token 을 같이 보냄
// -- 클라이언트는 브라우저에 token 을 저장 (보통은 localStorage 에 저장)
// -- 클라이언트에서 로그인이 필요한 요청을 보낼 때, token을 header 의 Auth 에 담아서 보냄

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.*;
import org.springframework.security.core.context.*;
import org.springframework.stereotype.*;
import org.springframework.util.*;
import org.springframework.web.filter.*;

import java.io.*;

@Slf4j
@Component
// onceperrequestfilter : 요청 당 한번만 실행
public class JwtAuthFilter extends OncePerRequestFilter {
  @Autowired
  TokenProvider tokenProvider;
  // -- 서버에서 요청 객체의 header > Auth 정보에서 token을 가져옴 . > 토큰이 유요한지 검증
  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
    try{    String token = getBearerToken(request);

      if(token != null && !token.equalsIgnoreCase("null")){
        String userId = tokenProvider.validateAndGetUserId(token);

        // 1. 사용자 정보를 담는 공간? 토큰 생성
        Authentication authentication = new UsernamePasswordAuthenticationToken(String.valueOf(userId), null, AuthorityUtils.NO_AUTHORITIES);

        // 2. SecurityContextHolder 에 authentication 정보 set
        // SecurityContextHolder : 클라이언트의 요청 -> 응답 사이에 일시적으로 auth 정보를 저장할 수 있는 공간
        SecurityContextHolder.getContext().setAuthentication(authentication);
      }
    } catch (Exception e) {
        log.error("auth error {}", e.getMessage());
    }


    filterChain.doFilter(request, response);
  }
  // token 을 헤더에서 가져오는 작업 
  public String getBearerToken (HttpServletRequest request){
    String bearer =  request.getHeader("Authorization");
    // "Bearer ergwergwerg.wertg34ge.erfgerg."
    // hasText : param 이 null 인지 아닌지, 길이가 0보다 큰 지 
    if(StringUtils.hasText(bearer) && bearer.startsWith("Bearer ")){
      // ergwergwerg.wertg34ge.erfgerg 이 만큼만 추출
      return bearer.substring(7);
    }
    return null;
  }
}
