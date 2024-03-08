package lecture.springbootsecurity.secutiry;

import io.jsonwebtoken.*;
import lecture.springbootsecurity.config.jwt.*;
import lecture.springbootsecurity.entity.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

// 토큰 발급하는 메서드 만들기
// 토큰 검증하는 메서드 만들기
@Component
public class TokenProvider {

  @Autowired
  JwtProperties jwtProperties;

  public String create(UserEntity userEntity){
    Date expireDate = Date.from(Instant.now().plus(1, ChronoUnit.DAYS));

    return Jwts.builder()
            .signWith(SignatureAlgorithm.HS512, jwtProperties.getSecretKey()) // 암호화 방식, secretKey 을 설정
            .setSubject(String.valueOf(userEntity.getId())) // payload 에 들어갈 정보
            .setIssuer(jwtProperties.getIssuer())
            .setIssuedAt(new Date())
            .setExpiration(expireDate)
            .compact(); // 토큰 생성
  }

  public String validateAndGetUserId(String token){
    Claims claims = Jwts.parser()
            .setSigningKey(jwtProperties.getSecretKey())   // secretKey 설정
            .parseClaimsJws(token) // 검증할 토큰 설정
            .getBody(); // payload 를 get하는 메서드
    return claims.getSubject();
  }
}
