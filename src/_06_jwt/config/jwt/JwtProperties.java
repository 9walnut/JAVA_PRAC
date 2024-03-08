package lecture.springbootsecurity.config.jwt;

import lombok.*;
import org.springframework.boot.context.properties.*;
import org.springframework.stereotype.*;

@Setter
@Getter
@Component
@ConfigurationProperties("jwt") // application properties jwt 관련 속성을 참고하여 해당 클래스의 필드와 값 설정
public class JwtProperties {
  private String issuer;
  private String secretKey;
}
