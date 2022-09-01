package com.learning.Session.controller;

import com.learning.Session.domain.User;
import com.learning.Session.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
@Data
public class LoginController {
  
  private final UserService userService;
  
  @GetMapping("user/CreateUser")
  public String createUser(){
    return "user/CreateUser";
  }
  @PostMapping("user/CreateUser")
  public String userCreated(@ModelAttribute User user){
    userService.add(user);
    return "redirect:/welcome";
  }
  @GetMapping("user/Login")
  public String login(){
    return "user/Login";
  }
  @PostMapping("user/Login")
  public String loggingin(@ModelAttribute User user){
    Optional<User> loggedUser = userService.login(user);
    if (loggedUser == null){
      return "redirect:/welcome";
    }
    else{
      return "user/LoggedIn";
    }
  }
  @GetMapping("Logout")
  public String logout(){
    
    return "user/Logout";
  }
}
