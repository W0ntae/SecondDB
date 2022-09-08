package com.web.jdbc.controller;

import com.web.jdbc.domain.Member;
import com.web.jdbc.service.MemberService;
import com.web.jdbc.service.MemberService1;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Data
public class MemberController {
  private final MemberService memberService;
  
  @GetMapping("member/view")
  public String getAll(Model model){
    List<Member> members = memberService.findAll();
    model.addAttribute("members", members);
    return "member/view";
  }
  
  @GetMapping("member/register")
  public String registerForm(){
    return "member/register";
  }
  
  @PostMapping("member/register")
  public String memberRegister(Member member){
    memberService.addMember(member);
    return "home";
  }
  
  @GetMapping("member/update")
  public String updateForm(Model model){
    List<Member> members = memberService.findAll();
    model.addAttribute("members", members);
    return "member/update";
  }
  
  @PostMapping("member/update")
  public String memberUpdate(Member member){
    memberService.updateMember(member);
    return "home";
  }
  
  @GetMapping("member/login")
  public String loginForm(){
    return "member/login";
  }
  
  @PostMapping("member/login")
  public String memberLogin(Member member){
    memberService.login(member);
    return "welcome";
  }
}
