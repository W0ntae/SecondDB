package com.learning.jpa.service;

import com.learning.jpa.domain.Board;
import com.learning.jpa.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService1 implements  BoardService{
  
  private final BoardRepository boardRepository;
  
  @Override
  public List<Board> findAll() {
    return boardRepository.findAll();
  }
  
  @Override
  public void addBoard(Board board) {
    boardRepository.addBoard(board);
  }
}
