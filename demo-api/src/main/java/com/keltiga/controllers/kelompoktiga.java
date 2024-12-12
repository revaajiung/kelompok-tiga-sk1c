package com.keltiga.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class kelompoktiga {
 
    
    @GetMapping
    public String welcomeString(){
        return "Welcome to project kelompok tiga";
    }
}
