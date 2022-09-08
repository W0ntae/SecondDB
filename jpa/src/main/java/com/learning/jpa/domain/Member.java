package com.learning.jpa.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Entity
@RequiredArgsConstructor
@Table(name = "users")
public class Member {
  private int UserID;
  @Id
  private String Username;
  private String Password;
  
  public Member(String Username, String Password){
    this.Username = Username;
    this.Password = Password;
  }
  public int getUserID(){
    return UserID;
  }
  public String getUsername(){
    return Username;
  }
  public String getPassword(){
    return Password;
  }
  public void setUserID(int UserID){
    this.UserID = UserID;
  }
  public void setUsername(String Username){
    this.Username = Username;
  }
  public void setPassword(String Password){
    this.Password = Password;
  }
  
  static public Member saveMember(String Username, String Password){
    Member member = new Member();
    member.setUsername(Username);
    Password = encryptPassword(Password);
    member.setPassword(Password);
    return member;
  }
  
  static public String encryptPassword(String Password){
    byte[] hash = null;
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      hash = md.digest(Password.getBytes(StandardCharsets.UTF_8));
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
    BigInteger number = new BigInteger(1, hash);
    StringBuilder hexString = new StringBuilder(number.toString(16));
    while(hexString.length() < 64){
      hexString.insert(0,"0");
    }
    return hexString.toString();
  }
}
