package com.learning.ajax.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
public class User {
  private int userid;
  @Id
  private String username;
  
  private String password;
  
  public void setUsername(String username){
    this.username = username;
  }
  
  public void setPassword(String password){
    this.password = password;
  }
}
