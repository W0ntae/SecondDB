package com.learning.session.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
  void add(@Param("username")String username, @Param("password")Double password);
}
