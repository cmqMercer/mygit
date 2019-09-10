package com.example.demo.controller;


import com.example.demo.dao.EmployeeDao;

import com.example.demo.entities.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;



    @GetMapping("/user/{name}")
    public User getUserByName(@PathVariable("name")String name){
        User user = userMapper.getUser(name);
        System.out.println(user==null?"null":user.getFname_l2());
    return user;
    }
}
