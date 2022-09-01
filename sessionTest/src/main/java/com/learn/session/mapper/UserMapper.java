package com.learn.session.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

  void addUser(@Param("username") String username, @Param("password") String password);
}
