package com.jquery.basic.repository;

import com.jquery.basic.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
  private final EntityManager em;
  
  public Member findMember(Member member){
    return em.find(Member.class, member.getUsername());
  }
}
