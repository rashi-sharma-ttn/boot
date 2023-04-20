package com.rest1.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ques1{
    @GetMapping(path = "/welcome")
    public String getMessage() {
        return "Hello world!";
    }
}
