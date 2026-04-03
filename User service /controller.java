package com.example.userservice.controller;

import com.example.userservice.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private Map<Long, User> users = new HashMap<>();

    @PostMapping
    public User createUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return user;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }
}
