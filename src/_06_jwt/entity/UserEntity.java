package lecture.springbootsecurity.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "user")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private long id;

  @Column(name = "username", length = 20, nullable = false)
  private String username;

  @Column(name = "email", length = 100, nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;
}
