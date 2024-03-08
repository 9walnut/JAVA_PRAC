package lecture.springbootsecurity.repository;


import lecture.springbootsecurity.entity.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
  UserEntity findByEmail(String email);

  Boolean existsByEmail(String email);

  UserEntity findByEmailAndPassword(String email, String password);
}
