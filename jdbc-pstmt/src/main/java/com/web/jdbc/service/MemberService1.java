package com.web.jdbc.service;

import com.web.jdbc.domain.Member;
import com.web.jdbc.repository.MemberRepository1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService1 implements  MemberService{
  
  private final MemberRepository1 memberRepository1;
  
  @Override
  public void addMember(Member member) {
    try {
      memberRepository1.addMember(member.getUsername(), member.getPassword());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  public void updateMember(Member member) {
    try{
      memberRepository1.updateMember(member.getUserID());
    } catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  
  @Override
  public List<Member> findAll() {
    try{
      return memberRepository1.findAll();
    } catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  
  @Override
  public void login(Member member) {
    try{
      memberRepository1.login(member.getUsername(), member.getPassword());
    } catch(Exception e){
      throw new RuntimeException(e);
    }
  }
}
