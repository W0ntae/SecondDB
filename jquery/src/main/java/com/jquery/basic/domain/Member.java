package com.jquery.basic.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Data
public class Member {
  
  private int UserID;
  @Id
  private String Username;
  
  private String Password;
}
