package com.learn.session.repository;

import com.learn.session.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MybatisUserRepository implements UserRepository{
  
  private final UserMapper userMapper;
  
  
  @Override
  public void add(String username, String password) {
    userMapper.addUser(username,password);
  }
}
