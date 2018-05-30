package com.avant.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: vellerzheng
 * @Description:
 * @Date:Created in 20:09 2018/5/29
 * @Modify By:
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;


    public String hello(String name) {
        return  restTemplate.getForObject("http://EUREKA-CLIENT/hello?name="+name, String.class);
    }
}
