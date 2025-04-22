package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Login;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm(Model model){
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@ModelAttribute("login") Login login, Model model){
        if("user".equals(login.getUsername()) && "pass".equals(login.getPassword())){
            return "home";
        }
        else{
            model.addAttribute("error", "Invalid");
            return "login";
        }
    }



}
