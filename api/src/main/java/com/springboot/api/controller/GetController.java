package com.springboot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get")
public class GetController {
    @GetMapping("/name")
    public String getName(){
        return "홍길동";
    }
    @GetMapping("/name2")
    public String getName2(){
        return "세종대왕";
    }
    @GetMapping("/member/{email}")
    public String getMember(@PathVariable("email") String email){
        return "email: " + email;
    }
    @GetMapping("/{id}/{name}")
    public String findByNameAndId(@PathVariable("id") long id, @PathVariable("name") String name){
        return "ID: " + id + ", Name: " + name;
    }
}
