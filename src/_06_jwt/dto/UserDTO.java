package lecture.springbootsecurity.dto;

import lombok.*;

@Getter
@Builder
public class UserDTO {
  private long id;

  private String username;

  private String email;

  private String password;
  private String token;
}
