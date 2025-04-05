package com.senai.ProjetoADS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {

    @GetMapping
    public String Welcome(){
        return "Welcome to the Project!";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Made by: Vinícius Ferreira.";
    }
}