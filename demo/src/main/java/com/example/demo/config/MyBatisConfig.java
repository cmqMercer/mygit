package com.example.demo.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MyBatisConfig {
    @Bean
   public ConfigurationCustomizer configurationCustomizer(){
       return new ConfigurationCustomizer(){
           @Override
           public void customize(Configuration configuration) {
               //开启驼峰大小写命名规则匹配
//               configuration.setMapUnderscoreToCamelCase(true);
           }
       };
   }
}
