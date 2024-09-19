package com.practise.userService.UserService.controller;

import com.practise.userService.UserService.entities.User;
import com.practise.userService.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User u = userService.saveuser(user);
//        return new ResponseEntity<>(u, HttpStatus.CREATED);
        return  ResponseEntity.status(HttpStatus.CREATED).body(u);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleuser(@PathVariable String userId){
        User u = userService.getUser(userId);
//        return  ResponseEntity.status(HttpStatus.FOUND).body(u);
        return  ResponseEntity.ok(u);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> u = userService.getUser();
//        return new ResponseEntity<>(u, HttpStatus.CREATED);
//        return  ResponseEntity.status(HttpStatus.FOUND).body(u);
        return  ResponseEntity.ok(u);
    }

}
