package com.learning.Session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {
  @GetMapping("/")
  public String welcome(){
    return "welcome";
  }
//  @GetMapping("/persistMessage")
//  public String persistMessage(@RequestParam("msg") String msg, HttpServletRequest request){
//    @SuppressWarnings("unchecked")
//            List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
//    if(messages == null){
//      messages = new ArrayList<>();
//      request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
//    }
//    messages.add(msg);
//    request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
//    return "redirect:/";
//  }
//  @PostMapping("/destroy")
//  public String destroySession(HttpServletRequest request){
//    request.getSession().invalidate();
//    return "redirect:/";
//  }
}
//@SuppressWarnings("unchecked")
//List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

//if (messages == null){
//  messages = new ArrayList<>();
// }
//model.addAttribute("sessionMessages", messages);