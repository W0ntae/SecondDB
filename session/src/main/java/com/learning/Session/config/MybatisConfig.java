package com.learning.Session.config;

import com.learning.Session.mapper.UserMapper;
import com.learning.Session.repository.MybatisUserRepository;
import com.learning.Session.repository.UserRepository;
import com.learning.Session.service.UserService;
import com.learning.Session.service.UserService1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {
  
  private final UserMapper userMapper;
  
  @Bean
  public UserService userService(){
    return new UserService1(userRepository());
  }
  
  @Bean
  public UserRepository userRepository(){
    return new MybatisUserRepository(userMapper);
  }
}
