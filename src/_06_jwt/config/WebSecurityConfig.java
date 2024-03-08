package lecture.springbootsecurity.config;

import lecture.springbootsecurity.secutiry.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.security.config.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.config.annotation.web.configurers.*;
import org.springframework.security.config.http.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.web.*;
import org.springframework.security.web.authentication.*;
import org.springframework.web.cors.*;

import java.util.*;


// 3.x 버전
@Configuration // spring 설정 클래스
@EnableWebSecurity // Spring security 를 사용한다
public class WebSecurityConfig {

  @Autowired
  JwtAuthFilter jwtAuthFilter;
  @Bean
  public BCryptPasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }
  @Bean // 스프링 컨테이너에서 관리
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    // 스프링시큐리티 적용화면, 기본적으로 모든 경로에 인증이 있어야 접근이 가능
    // 특정 경로에서 인증 없이 접근할 수 있도록 설정
    http
            .cors(Customizer.withDefaults())
            .csrf(CsrfConfigurer::disable) // post, put 요청을 허용
            .sessionManagement(sessionM -> sessionM.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) // 세션 사용 안하겠다(기본값 : if_required)
            .authorizeHttpRequests(authroize -> authroize
            .requestMatchers("/auth/**").permitAll()
//            .requestMatchers("/admin/**").hasRole("ADMIN")
            .anyRequest().authenticated() // 위에 나온 주소 말고 나머지 주소는 로그인이 필요
            );
    // .permitAll() : 권한 없이 접속 가능
    // .authenticated() : 로그인이 필요하다
    // .hasRole("권한? ex.ADMIN") : 특정 권한이 있어야 접속 가능
    http.addFilterAfter(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

    return http.build();
  }
  @Bean // React 에서 요청했을 때 cors 이슈를 해결
  public CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration config = new CorsConfiguration();

    // cors 설정
    config.setAllowCredentials(true); // 실제 응답을 보낼 때, 브라우저에게 자격 증명과 함께 요청을 보낼 수 있도록 허용합니다.
    config.setAllowedOriginPatterns(Arrays.asList("*")); // 모든 원본에서의 요청을 허용합니다.
    config.setAllowedMethods(Arrays.asList("HEAD","POST","GET","DELETE","PUT", "PATCH")); // 허용할 HTTP 메서드를 설정합니다.
    config.setAllowedHeaders(Arrays.asList("*")); // 모든 헤더의 요청을 허용합니다.


    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", config); // 모든 경로에 대해 위에서 설정한 CORS 설정을 적용합니다.

    return source;
  };
}
