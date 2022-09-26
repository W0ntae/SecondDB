package com.learning.ajax.service;

import com.learning.ajax.domain.User;
import com.learning.ajax.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
  
  private final UserRepository userRepository;
  
  public List<User> findAll(){
    return userRepository.findAll();
  }
  
  public void addUser(User user){
    userRepository.addUser(user);
  }
}
