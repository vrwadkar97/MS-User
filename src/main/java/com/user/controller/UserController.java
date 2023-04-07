package com.user.controller;

import com.user.entity.User;
import com.user.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserImpl impl;

    @PostMapping("/add")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        return new ResponseEntity<>(impl.addUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getUser(@PathVariable String id){
        return new ResponseEntity<>(impl.getUser(id), HttpStatus.FOUND);
    }




}
