package com.web.jdbc.service;

import com.web.jdbc.domain.Member;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MemberService {
  void addMember(Member member);
  
  void updateMember(Member member);
  
  List<Member> findAll();
  
  void login(Member member);
}
