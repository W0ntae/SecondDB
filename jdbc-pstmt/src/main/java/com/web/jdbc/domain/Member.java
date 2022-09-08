package com.web.jdbc.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
  private String Password;
  private String Username;
  
  private String UserID;
  
  public Member(String UserId){
    this.UserID = UserId;
  }
  
  public Member(String Username, String Password){
    this.Username = Username;
    this.Password = Password;
  }
  
  public Member(String UserID, String Username, String Password){
    this.UserID = UserID;
    this.Username = Username;
    this.Password = Password;
  }
}
