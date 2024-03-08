package lecture.springbootsecurity.controller;

import jakarta.servlet.http.*;
import lecture.springbootsecurity.dto.*;
import lecture.springbootsecurity.entity.*;
import lecture.springbootsecurity.secutiry.*;
import lecture.springbootsecurity.service.*;
import lombok.extern.slf4j.*;
import org.apache.catalina.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Slf4j // 로그 관련 메서드를 편리하게 사용할 수 있음.
public class UserController {
  @Autowired
  UserService userService;
  @Autowired
  BCryptPasswordEncoder passwordEncoder;

  @Autowired
  TokenProvider tokenProvider;

  @GetMapping("")
  public String getAuth(){
    return "GET /auth";
  }
  @PostMapping("/signup")
  // ?  - 와일드 카드 ( 어떤 값을 body에 담을지 모름)
  public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO){
    try{
      UserEntity user = UserEntity.builder()
            .email(userDTO.getEmail())
            .username(userDTO.getUsername())
            .password(passwordEncoder.encode(userDTO.getPassword()))
            .build();
      UserEntity responseUser = userService.create(user);
      UserDTO responseUserDTO = UserDTO.builder()
              .email(responseUser.getEmail())
              .username(responseUser.getUsername())
              .id(responseUser.getId())
              .build();
      return ResponseEntity.ok().body(responseUserDTO);
    } catch (Exception e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  @PostMapping("/signin")
  public ResponseEntity<?> loginUser(HttpSession session, @RequestBody UserDTO userDTO){
    try{
      UserEntity user  = userService.login(userDTO.getEmail(), userDTO.getPassword());

      if(user == null){
        throw new RuntimeException("login falied");
      }
      String token =  tokenProvider.create(user);

      UserDTO responseUserDTO = UserDTO.builder()
              .email(user.getEmail())
              .username(user.getUsername())
              .id(user.getId())
              .token(token)
              .build();
//      log.info();
//      log.error();
      log.warn("session id {}", session.getId());
      session.setAttribute("userId", user.getId());
      return ResponseEntity.ok().body(responseUserDTO);
    } catch (Exception e){
      return ResponseEntity.badRequest().body(e.getMessage());    }
    }

}
