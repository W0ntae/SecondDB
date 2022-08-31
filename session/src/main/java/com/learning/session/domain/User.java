package com.learning.session.domain;

import lombok.Data;

@Data
public class User {
  String Username;
  Double Password;
  
  public User(){
  
  }
  
  public User(String username, Double password){
    this.Username = username;
    this.Password = password;
  }
}
