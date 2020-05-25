package com.example.springboot.controller;

import com.example.springboot.bean.UserBean;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }

    @RequestMapping(value = "/user/query",method = RequestMethod.POST)
    public String queryUser(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 修改用户信息
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "/user/update",method = RequestMethod.POST)
    public String updateUser(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 保存用户信息(wxl)
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "user/insert",method = RequestMethod.POST)
    public String insertUser(String name ,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }
}