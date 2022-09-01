package com.learn.session.service;

import com.learn.session.domain.User;
import com.learn.session.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService1 implements  UserService{
  
  private final UserRepository userRepository;
  
  
  @Override
  public void add(User user) {
    userRepository.add(user.getUsername(), user.getPassword());
  }
}
