package com.learning.ajax.service;

import com.learning.ajax.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
  
  private final UserRepository userRepository;
  
  public void insertUser(){
  
  }
}
