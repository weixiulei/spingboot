package com.example.springboot.mapper;


import com.example.springboot.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);

}