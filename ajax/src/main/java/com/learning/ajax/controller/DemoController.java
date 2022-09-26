package com.learning.ajax.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
public class DemoController {
  @GetMapping("/")
  public String home(){
    return "index";
  }
  
}
