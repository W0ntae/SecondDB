package com.learning.ajax.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjaxController")
public class AjaxController extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  public AjaxController(){
    super();
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response){
  
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response){
    doGet(request,response);
  }
  
}
