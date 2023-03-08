package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    
    @GetMapping("/signup1")
    public String signupForm(){
        return "signup.html";
    }

    @PostMapping("/users")
    public String homePage(@ModelAttribute User user){
       return "home.html";
    }
}
