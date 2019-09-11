package com.example.demo.dubboServices;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dubboServices.DemoServices;
import org.springframework.stereotype.Component;

@Component
@Service
public class DemoServicesImp implements DemoServices {
    @Override
    public String connect() {
        return "连接成功";
    }
}
