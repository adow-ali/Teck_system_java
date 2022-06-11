package com.example.servletdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
 @GetMapping("/")
 public String home() {
	 return "Hello from the controller";
 }
}
