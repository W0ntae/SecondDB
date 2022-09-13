package com.learning.jpa.service;

import com.learning.jpa.domain.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService1 implements  BoardService{
  @Override
  public List<Board> findAll() {
    return null;
  }
}
