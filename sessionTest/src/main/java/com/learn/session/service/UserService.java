package com.learn.session.service;

import com.learn.session.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
  void add(User user);
}
