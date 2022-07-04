package com.itcodeschool.consumer_feign.feignclient;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserServiceFeignClientFallBack implements UserServiceFeignClient {
    @Override
    public List getUserInfo(){
        List list = new ArrayList();
        list.add("系统繁忙，请稍后再试");
        return list;
    }
}
