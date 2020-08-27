package com.jratil.shardingdemo1.controller;

import com.jratil.shardingdemo1.model.User;
import com.jratil.shardingdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wenjunjun9
 * @created 2020/8/21 17:52
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public User find(@PathVariable("id") Integer id) {
        User user = userService.find(id);
        return user;
    }

    @GetMapping("/get")
    public String find() {
        List<User> users = userService.findAll();
        return users.toString();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "success";
    }

    @GetMapping("/get/name/{name}")
    public Object findByName(@PathVariable("name") String name) {
        List<User> list = userService.findByName(name);
        return list;
    }
}
