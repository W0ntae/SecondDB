package com.learning.session.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MybatisUserRepository implements UserRepository{
  
  @Override
  public void addUser(String username, Double password) {
  
  }
}
