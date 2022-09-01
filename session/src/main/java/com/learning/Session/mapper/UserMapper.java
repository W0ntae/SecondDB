package com.learning.Session.mapper;

import com.learning.Session.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface UserMapper {
  void add(@Param("username") String username, @Param("password") String password);
  
  Optional<User> login(@Param("username")String username, @Param("password")String password);
}
