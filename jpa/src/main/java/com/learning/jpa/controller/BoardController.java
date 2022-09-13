package com.learning.jpa.controller;

import com.learning.jpa.domain.Board;
import com.learning.jpa.service.BoardService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Data
public class BoardController {
  
  private final BoardService boardService;
  
  @GetMapping("board/boardCreate")
  public String boardCreateForm(){
    return "board/boardCreate";
  }
  @PostMapping("board/boardCreate")
  public String boardCreate( ){
    return "member/welcome";
  }
  
  @GetMapping("board/boardDirectory")
  public String boardView(Model model){
    List<Board> boards = boardService.findAll();
    model.addAttribute("boards", boards);
    return "board/boardDirectory";
  }
}
