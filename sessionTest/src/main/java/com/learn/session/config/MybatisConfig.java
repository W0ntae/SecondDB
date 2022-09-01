package com.learn.session.config;

import com.learn.session.mapper.UserMapper;
import com.learn.session.repository.MybatisUserRepository;
import com.learn.session.repository.UserRepository;
import com.learn.session.service.UserService;
import com.learn.session.service.UserService1;
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
