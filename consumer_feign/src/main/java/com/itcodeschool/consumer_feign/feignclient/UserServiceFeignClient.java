package com.itcodeschool.consumer_feign.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "EUREKA-PROVIDER", fallback = UserServiceFeignClientFallBack.class)
public interface UserServiceFeignClient {
    @RequestMapping("/getUserInfo")
    List getUserInfo();
}
