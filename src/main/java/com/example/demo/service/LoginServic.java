package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Login;
import com.example.demo.repository.LoginRepo;

@Service
public class LoginServic {

    @Autowired
    private LoginRepo repo;
    
    public void showValidLogin(Login login){
        Login validLogin = repo.findByUsernameAndPassword(login.getUsername(), login.getPassword());
        validLogin.equals(null); //check
        
    }


}
