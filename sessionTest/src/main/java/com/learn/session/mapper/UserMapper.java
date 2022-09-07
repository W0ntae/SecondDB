package com.learn.session.mapper;

import com.learn.session.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;


@Mapper
public interface UserMapper {

  void addUser(@Param("Username") String username, @Param("Password") String password);
  
  Optional<User> login(@Param("Username") String username, @Param("Password") String password);
}
