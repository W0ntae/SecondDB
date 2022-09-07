package com.learn.session.service;

import com.learn.session.domain.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
  void add(User user);
  
  Optional<User> login(User user);
}
