package com.learning.jpa.repository;

import com.learning.jpa.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {
  List<Board> findAll();
}
