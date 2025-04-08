package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete")
public class DeleteController {
    @DeleteMapping("/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){

        System.out.println(userId);
        System.out.println(account);
    }
}
