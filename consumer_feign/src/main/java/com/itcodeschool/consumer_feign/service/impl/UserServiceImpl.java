package com.itcodeschool.consumer_feign.service.impl;

import com.itcodeschool.consumer_feign.feignclient.UserServiceFeignClient;
import com.itcodeschool.consumer_feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserServiceFeignClient Client;
    public List getUserInfo() {
        List list = Client.getUserInfo();
        return list;
    }
}
