package com.ivoronline.springboot_test_mockmvc_response_body.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @GetMapping("/Hello")
  public String hello(@RequestParam String name) {
    return "Hello " + name;
  }

}
