package com.example.firstTry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class new01 {

    @GetMapping("/Adesh")
    public String sayHello() {
        return "Hello, Spring Booooot!";
    }
}
