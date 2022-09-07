package com.learn.session.servlet;


import com.learn.session.service.UserService;
import lombok.Data;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Data
@WebServlet(
        urlPatterns = "Login"
)
public class LoginServlet extends HttpServlet {
  
  private final UserService userService;
  
 public void Login(HttpServletRequest request, HttpServletResponse response) throws IOException {
   HttpSession session = request.getSession();
   
 }
}
