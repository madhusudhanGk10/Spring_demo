package com.mtiet.Appdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/hello")
    public String sayHi()
    {
        return "welcome to andhra";
    }
}
