package com.learning.jpa.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "boards")
public class Board {
  @Id
  private int BoardID;
  private String Content;
  private String Author;
  private String CreatedDate;
  private String EditDate;
}
