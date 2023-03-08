package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class UserController {
    
    @GetMapping("/signup1")
    public String signupForm(){
        return "signup.html";
    }

    @PostMapping("/user")
    public String homePage(@ModelAttribute User user){
       //return "home.html";
       return "redirect:/home.html";

    }


    

}

