package com.example.springboot.service;

import com.example.springboot.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name,String password);

}