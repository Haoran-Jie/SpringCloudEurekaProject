package com.itcodeschool.consumer_feign.controller;

import com.itcodeschool.consumer_feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    UserService userService;
    @RequestMapping("/getUserInfo")
    public List getUserInfo(){
        System.out.println("sonsumer_feign......controller....执行了.......");
        return userService.getUserInfo();
    }
}
