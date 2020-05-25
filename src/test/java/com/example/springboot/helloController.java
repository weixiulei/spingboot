package com.example.springboot;


import org.springframework.web.bind.annotation.RequestMapping;

public class helloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

}
