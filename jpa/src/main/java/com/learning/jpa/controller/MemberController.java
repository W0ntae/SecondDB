package com.learning.jpa.controller;

import com.learning.jpa.domain.Member;
import com.learning.jpa.service.MemberService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
@Data
public class MemberController {
  private final MemberService memberService;
  
  @GetMapping("member/register")
  public String registerForm(){
    return "member/register";
  }
  @PostMapping("member/register")
  public String registered(String Username, String Password){
    memberService.registerMember(Username, Password);
    return "redirect:/";
  }
  
  @GetMapping("member/login")
  public String loginForm(){
    return "member/login";
  }
  @PostMapping("member/login")
  public String login(Member member, HttpServletRequest request) {
    Member loggedMember = memberService.loginMember(member.getUsername());
    if (loggedMember == null){
      return "member/failedLog";
    }
    if(loggedMember.getPassword().equals(member.encryptPassword(member.getPassword()))){
      
      return "welcome";
    }
    return "redirect:/";
  }
}
