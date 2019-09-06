package com.example.demo.controller;

import com.example.demo.exception.UserNotExist;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {
//    @ResponseBody
//    @ExceptionHandler(UserNotExist.class)
//    public  Map<String,Object> handleException(Exception e){
//        Map<String,Object> map = new HashMap<>();
//        map.put("msg",e.getMessage());
//        return  map;
//    }


    @ExceptionHandler(UserNotExist.class)
    public  String handleException(Exception e, HttpServletRequest request){
        request.setAttribute("javax.servlet.error.status_code",400);
        Map<String,Object> map = new HashMap<>();
        map.put("msg1","handleException1");
        map.put("msg2","handleException2");
        request.setAttribute("ext",map);
        return  "forward:/error";
    }
}
