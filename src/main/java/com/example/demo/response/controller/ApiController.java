package com.example.demo.response.controller;

import com.example.demo.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //Text
    @GetMapping("/text")
    public String text(@RequestParam String account){

        return account;
    }

    //JSON
    //req-> object mapper -> object-> method-> object
    @PostMapping("/json")
    public User json(@RequestBody User user){

        return user;
    }

    //응답에 대한 커스터마이징
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){

       return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
