package lecture.springbootsecurity.controller;

import org.springframework.security.core.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoContorller {
  @GetMapping("")
  public String  getTodo(@AuthenticationPrincipal String userId){
    // @AuthenticationPrincipal : SecurityContextHolder
    // 값을 자동으로 userId에 할당해주는 역할
    return "GET /todo by user id" + userId;
  }
}
