package com.example.demo.consumer;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.dubboServices.DemoServices;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @Reference
    DemoServices demoServices;

    public String getConn(){
        return demoServices.connect();
    }
}
