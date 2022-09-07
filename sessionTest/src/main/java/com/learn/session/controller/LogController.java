package com.learn.session.controller;

import com.learn.session.domain.User;
import com.learn.session.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
@Data
public class LogController {
  
  private final UserService userService;
  
  @GetMapping("user/CreateUser")
  public String createForm(){
    return "user/CreateUser";
  }
  
  @PostMapping("user/CreateUser")
  public String userCreated(@ModelAttribute User user){
    userService.add(user);
    return "redirect:/";
  }
  
  @GetMapping("user/Login")
  public String loginForm(){
    return "user/Login";
  }
  
  @PostMapping("user/Login")
  public String loggedIn(@ModelAttribute User user){
    Optional<User> loggedUser = userService.login(user);
    if (loggedUser == null){
      return "user/Login";
    }
    else{
      
      return "user/LoggedIn";
    }
  }
}
