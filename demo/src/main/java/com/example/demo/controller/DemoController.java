package com.example.demo.controller;


import com.example.demo.exception.UserNotExist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user")String user)
    {
        if(user.equals("aaa")){
            throw new UserNotExist();
        }
        return "hello";
    }

    @RequestMapping("/success")
public String success(){
        return "success";
    }
}

