package com.web.jdbc.repository;

import com.web.jdbc.config.DBLogin;
import com.web.jdbc.domain.Member;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class MemberRepository1 implements  MemberRepository{
  
  @Override
  public void addMember(String username, String password) throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sessiondb", "study", "1111");
    
    String insertString = "insert into sessiondb.users(Username, Password) values (?,sha2(?,256))";
    try(PreparedStatement insertMember = con.prepareStatement(insertString)){
      con.setAutoCommit(false);
      insertMember.setString(1, username);
      insertMember.setString(2, password);
      insertMember.executeUpdate();
      con.commit();
    }
    catch(SQLException e){
      if (con != null) {
        try {
          System.err.print("Transaction is being rolled back");
          con.rollback();
        }
        catch (SQLException ex) {
          System.err.println(ex);
        }
      }
    }
  }
  
  @Override
  public void updateMember(String UserId) throws Exception {
  
  }
  
  @Override
  public List<Member> findAll() throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sessiondb", "study", "1111");
  
    String findString = "select UserID,Username from sessiondb.users";
    ResultSet rst = null;
    List<Member> memlist = new ArrayList<>();
    try(PreparedStatement findAll = con.prepareStatement(findString)){
      rst = findAll.executeQuery();
      while(rst.next()){
        Member tempmember = new Member();
        tempmember.setUserID(rst.getString(1));
        tempmember.setUsername(rst.getString(2));
        memlist.add(tempmember);
      }
      findAll.close();
      return memlist;
    }
    catch (SQLException ex){
      System.err.println(ex);
    }
    return memlist;
  }
  
  @Override
  public void login(String Username, String Password) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sessiondb", "study", "1111");
  
    String logString = "select * from sessiondb.users where Username = ?, Password = ?";
    ResultSet rst = null;
    try(PreparedStatement login = con.prepareStatement(logString)){
      login.setString(1, Username);
      login.setString(2, Password);
      rst = login.executeQuery();
      if (rst == null){
        return;
      }
      else{
        String UserID = rst.getString(1);
      }
    }
    catch (SQLException ex) {
    System.err.println(ex);
    }
  }
}
