package com.learning.ajax.repository;

import com.learning.ajax.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
  
  private final EntityManager em;
  
  public List<User> findAll(){
    return em.createQuery("Select * from users").getResultList();
  }
  
  @Transactional
  public void addUser(User user){
    em.persist(user);
  }
}
