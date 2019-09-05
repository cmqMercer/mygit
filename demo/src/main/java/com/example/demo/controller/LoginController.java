package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {


@PostMapping("/user/login")
    public String login(@RequestParam("username") String name , @RequestParam("password") String pwd, Map<String,Object> error, HttpSession session){
    if(name!=null&&pwd.equals("123")){
        session.setAttribute("loginUser",name);
        return "redirect:/main.html";
    }else{
        error.put("msg","密码错误");
        return "login";
    }

    }
}
