package com.rest2.rest2.internationalisation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q2 {
    @GetMapping("/hello/{name}")
    public String get(@PathVariable String name){

        return "hello"+" "+name;
    }
}