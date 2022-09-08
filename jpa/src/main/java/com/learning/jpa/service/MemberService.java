package com.learning.jpa.service;

import com.learning.jpa.domain.Member;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MemberService {
  void registerMember(String Username, String Password);
  
  Member loginMember(String Username);
}
