package com.example.demo.config;

import com.example.demo.filter.MyFilter;
import com.example.demo.listener.MyListener;
import com.example.demo.servlet.MyServlet;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.embedded.TomcatWebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyServletConfig {


@Bean
public ServerProperties serverProperties(){
    ServerProperties s=  new ServerProperties();
   s.setPort(8080);
   return s;

}
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean servlet= new ServletRegistrationBean(new MyServlet(),"/MyServlet");

        return servlet;
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new MyFilter());
            filter.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return filter;

    }
    @Bean
    public ServletListenerRegistrationBean MyListener(){
        ServletListenerRegistrationBean<MyListener> listener = new ServletListenerRegistrationBean<>(new MyListener());
         return listener;
    }

}
