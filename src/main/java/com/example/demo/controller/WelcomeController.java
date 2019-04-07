package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "welcome")
public class WelcomeController {

    @GetMapping("/{name}")
    String greet(@PathVariable(value = "name") String name){
        System.out.println("Reached here...");
        System.out.println("Name "+name);
        return "Welcome "+name+" ....   ";
    }
}
