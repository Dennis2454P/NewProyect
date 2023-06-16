package com.motorgbs.apirest.controller;

import com.motorgbs.apirest.UserService;
import com.motorgbs.apirest.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createuser(user);
    }
    @GetMapping
    public User getUser()

}
