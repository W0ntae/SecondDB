package com.learning.ajax.controller;

import com.learning.ajax.domain.User;
import com.learning.ajax.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AjaxController")
public class AjaxController extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  private UserService userService;
  public AjaxController(){
    super();
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response){
    
    
    
    response.setContentType("application/json");
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response){
    doGet(request,response);
  }
  
@WebServlet("/test")
public class test extends HttpServlet{
    private static final long serialVersionUID = 1L;
    
    public test(){
      super();
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
       userService.findAll();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
      User user = new User();
      user.setUsername(request.getParameter("Username"));
      user.setPassword(request.getParameter("Password"));
      userService.addUser(user);
    }
}

}
