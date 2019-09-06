package com.example.demo.config;


import com.example.demo.compont.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        registry.addViewController("/hello").setViewName("success");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/","/user/login");
    }

    @Bean
    public WebMvcConfigurer WebMvcConfigurer(){
        WebMvcConfigurer adapterter = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
                registry.addViewController("/index.html").setViewName("login");
            }
        };
        return adapterter;

    }
}
