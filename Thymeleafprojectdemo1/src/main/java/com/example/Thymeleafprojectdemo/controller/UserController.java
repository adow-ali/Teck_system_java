package com.example.Thymeleafprojectdemo.controller;


import com.example.Thymeleafprojectdemo.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    //making a request, then using a method to handle that request
    @GetMapping(value="/")
    public String index(){ // handle method
        return "index"; // return a html doc to the screen
    }

//    @RequestMapping(value="/profile", method = RequestMethod.POST)
    @PostMapping(value="/profile")
    public ModelAndView profile(@ModelAttribute UserEntity userEntity){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("profile"); // view it on our profile.html page
        modelAndView.addObject("UserEntity", userEntity); // access to the data from the userEntity
        return modelAndView;
    }
}
