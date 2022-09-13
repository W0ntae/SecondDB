package com.learning.jpa.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@RequiredArgsConstructor
@Table(name = "boards")
public class Board {
  
  private int BoardId;
  @Id
  private String Title;
  private String Content;
  private String Author;
  private Date CreatedDate;
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
