package com.learning.jpa.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Data
public class BoardController {
  
  @GetMapping("board/boardCreate")
  public String boardCreateForm(){
    return "board/boardCreate";
  }
  @PostMapping("board/boardCreate")
  public String boardCreate( ){
    return "member/welcome";
  }
}
