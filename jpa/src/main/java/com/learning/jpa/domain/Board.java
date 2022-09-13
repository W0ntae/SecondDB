package com.learning.jpa.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@RequiredArgsConstructor
@Table(name = "boards")
public class Board implements Serializable {
  
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column (nullable = false)
  private int BoardId;
  
  @Column (unique = true, nullable = false)
  @Id
  private String Title;
  
  @Column (nullable = false)
  private String Content;
  
  @Column (nullable = false)
  private String Author;
  
  @Column (nullable = false)
  private Date CreatedDate;
  @Column
  private Date EditDate;
  
  public void setBoardId(int boardId){
    this.BoardId = boardId;
  }
  
  public void setTitle(String title){
    this.Content = title;
  }
  
  public void setContent(String content){
    this.Content = content;
  }
  
  public void setAuthor(String author){
    this.Author = author;
  }
  
  public void setCreatedDate(Date date){
    this.CreatedDate = date;
  }
  
  public void setEditDate(Date date){
    this.EditDate = date;
  }
}
