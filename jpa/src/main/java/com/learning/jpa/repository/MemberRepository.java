package com.learning.jpa.repository;

import com.learning.jpa.domain.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository{
  void registerMember(Member member);
  
  Member findMember(Member member);
}
