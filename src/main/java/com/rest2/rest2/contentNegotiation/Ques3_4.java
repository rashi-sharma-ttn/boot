package com.rest2.rest2.contentNegotiation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Ques3_4 {
    List<User>list=new ArrayList<>();

    @GetMapping("/users")
    public List<User> getUser(){
        return list;
    }
    @PostMapping("/users")
    public User adduser(@RequestBody User u){
        list.add(u);
        return u;
    }


}