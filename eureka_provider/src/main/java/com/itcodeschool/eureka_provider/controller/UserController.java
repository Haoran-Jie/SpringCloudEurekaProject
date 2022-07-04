package com.itcodeschool.eureka_provider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/getUserInfo")
    public List getUserInfo(){
        List list = new ArrayList();
        list.add("user1");
        list.add("user2");
        list.add("user3");
        return list;
    }
}
