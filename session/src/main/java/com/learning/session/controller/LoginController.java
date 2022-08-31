package com.learning.session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
  @GetMapping("CreateUser")
  public String createUser(){
    return "user/CreateUser";
  }
  @PostMapping("CreateUser")
  public String userCreated(){
    return "welcome";
  }
  @GetMapping("Login")
  public String login(){
    
    return "user/Login";
  }
}
