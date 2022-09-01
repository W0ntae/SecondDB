package com.learning.Session.repository;

import com.learning.Session.domain.User;
import com.learning.Session.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisUserRepository implements UserRepository{
  
  private final UserMapper userMapper;
  
  @Override
  public void add(String username, String password) {
    userMapper.add(username, password);
  }
  
  @Override
  public Optional<User> login(String username, String password) {
    return userMapper.login(username,password);
  }
  
}
