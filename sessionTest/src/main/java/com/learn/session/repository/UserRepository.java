package com.learn.session.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
  void add(String username, String password);
}
