package com.learning.jpa.repository;

import com.learning.jpa.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepository1 implements MemberRepository{
  
  private final EntityManager em;
  
  @Override
  public void registerMember(Member member){
    em.persist(member);
  }
  
  @Override
  public Member findMember(Member member) {
    return em.find(Member.class, member.getUsername());
  }
}