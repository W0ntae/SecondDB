package com.learning.Session.service;

import com.learning.Session.domain.User;

import java.util.Optional;

public interface UserService {
  void add(User user);
  
  Optional<User> login(User user);
}
