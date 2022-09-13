package com.learning.jpa.service;

import com.learning.jpa.domain.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
  List<Board> findAll();
  
  void addBoard(Board board);
}
