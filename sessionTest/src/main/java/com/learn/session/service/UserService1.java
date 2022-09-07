package com.learn.session.service;

import com.learn.session.domain.User;
import com.learn.session.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService1 implements  UserService{
  
  private final UserRepository userRepository;
  
  
  @Override
  public void add(User user) {
    userRepository.add(user.getUsername(), user.getPassword());
  }
  
  @Override
  public Optional<User> login(User user) {
    return userRepository.login(user.getUsername(),user.getPassword());
  }
}
