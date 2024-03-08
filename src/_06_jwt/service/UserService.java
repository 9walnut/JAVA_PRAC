package lecture.springbootsecurity.service;

import lecture.springbootsecurity.entity.*;
import lecture.springbootsecurity.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.stereotype.*;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private BCryptPasswordEncoder passwordEncoder;
  public UserEntity create(UserEntity userEntity){ // 회원가입할 때 사용될 메서드
    if(userEntity == null){
      throw new RuntimeException("entity null");
    }
    // 중복 이메일 불가
    String email = userEntity.getEmail();

    if(userRepository.existsByEmail(email)){
      throw new RuntimeException("이미 존재하는 이메일");
    }
    return userRepository.save(userEntity);
  }

//  [before]암호화 이전
//  public UserEntity login(String email, String password){
//    return userRepository.findByEmailAndPassword(email, password);
//  }

//  [after]
  // 암호화 적용 후
  public UserEntity login(String email, String password){
    UserEntity searchUser = userRepository.findByEmail(email);

    if (searchUser != null && passwordEncoder.matches(password, searchUser.getPassword())) {

      return searchUser;
    }

    return null;
  }
}
