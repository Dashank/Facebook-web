package com.example.facebookapi.controllers;

import com.example.facebookapi.models.User;
import com.example.facebookapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;
@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/getUsers")
    public ArrayList<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable("userId") String userID) {
        return userService.getUser(userID);
    }

}
