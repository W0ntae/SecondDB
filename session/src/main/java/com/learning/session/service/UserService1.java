package com.learning.session.service;

import com.learning.session.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService1 implements UserService{
  private final UserRepository userRepository;
  
  @Override
  public void addUser(String username, Double password) {
    userRepository.addUser(username,password);
  }
}
