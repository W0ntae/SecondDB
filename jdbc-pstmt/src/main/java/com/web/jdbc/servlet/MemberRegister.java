package com.web.jdbc.servlet;

import com.web.jdbc.domain.Member;
import com.web.jdbc.service.MemberService;
import com.web.jdbc.service.MemberService1;
import lombok.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Data
@WebServlet(
        urlPatterns = "member/register"
)
public class MemberRegister extends HttpServlet {
  
  private final MemberService1 memberService1;
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
  
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String username = request.getParameter("username");
    String Spassword = request.getParameter("password");
    memberService1.addMember(new Member(username, Spassword));
  }
}
