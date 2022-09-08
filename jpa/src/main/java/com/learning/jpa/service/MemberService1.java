package com.learning.jpa.service;

import com.learning.jpa.domain.Member;
import com.learning.jpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService1 implements MemberService{
  
  private final MemberRepository memberRepository;
  
  @Override
  public void registerMember(String Username, String Password) {
    Member member = Member.saveMember(Username,Password);
    memberRepository.registerMember(member);
  }
  
  @Override
  public Member loginMember(String Username) {
    Member member = Member.saveMember(Username, "");
    return memberRepository.findMember(member);
  }
}
