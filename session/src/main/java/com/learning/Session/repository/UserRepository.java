package com.learning.Session.repository;

import com.learning.Session.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {
  void add(String username, String password);
  
  Optional<User> login(String username, String password);
}
