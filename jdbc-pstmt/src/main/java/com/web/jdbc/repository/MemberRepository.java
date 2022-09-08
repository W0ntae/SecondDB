package com.web.jdbc.repository;

import com.web.jdbc.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository {
  void addMember(String username, String password) throws Exception;
  
  void updateMember(String UserId) throws Exception;
  
  List<Member> findAll() throws Exception;
  
  void login(String Username, String Password) throws Exception;
}
