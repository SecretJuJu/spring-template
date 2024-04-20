package com.example.helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello, World!";
  }
}
