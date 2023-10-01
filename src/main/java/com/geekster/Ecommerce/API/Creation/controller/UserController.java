package com.geekster.Ecommerce.API.Creation.controller;

import com.geekster.Ecommerce.API.Creation.model.User;
import com.geekster.Ecommerce.API.Creation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }
}
