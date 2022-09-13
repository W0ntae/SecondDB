package com.learning.jpa.repository;

import com.learning.jpa.domain.Board;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository1 implements BoardRepository{
  
  private final EntityManager em;
  
  @Override
  public List<Board> findAll() {
    TypedQuery<Board> select = em.createQuery("select b from boards as b", Board.class);
    return select.getResultList();
  }
}
