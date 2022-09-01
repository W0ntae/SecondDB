package com.learning.Session.domain;

import lombok.Data;

@Data
public class User {
  String Username;
  String Password;
  
  public User(){
  
  }
  
  public User(String username, String password){
    this.Username = username;
    this.Password = password;
  }
}
