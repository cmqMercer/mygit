package com.example.demo.controller;


import com.example.demo.consumer.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class ConsumerController {

    @Autowired
    Consumer consumer;

    @GetMapping("/consumer")
    public String getCon(){
        return consumer.getConn();
    }

}
