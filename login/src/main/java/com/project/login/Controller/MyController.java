package com.project.login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
    @GetMapping("/login")
    public String showLoginPage() {
        // This tells Spring to find a file named "login.html"
        return "login.html";
    }

    @GetMapping("/signup")
    public String showSignupPage() {
        // This tells Spring to find a file named "signup.html"
        return "signup.html";
    }
}