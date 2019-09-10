package com.example.demo.mapper;


import com.example.demo.entities.User;
import org.apache.ibatis.annotations.*;


public interface UserMapper {
@Select("select *  from t_pm_user where fname_l2 = #{name}")
   public User getUserByName(String name);


public User getUserByNumber(String number);


}
