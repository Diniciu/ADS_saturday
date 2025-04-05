package com.exampleSenai.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Demo {

    @GetMapping
    public String Demo(){
        return "Based in Java.";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Website was made based in SpringBoot.";
    }
}