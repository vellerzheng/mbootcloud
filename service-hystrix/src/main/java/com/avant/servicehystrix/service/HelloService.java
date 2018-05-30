package com.avant.servicehystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: vellerzheng
 * @Description:
 * @Date:Created in 20:09 2018/5/30
 * @Modify By:
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，
     * 熔断方法直接返回了一个字符串，字符串为”hi,”+name+”,sorry,error!”
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hello(String name) {
        return  restTemplate.getForObject("http://EUREKA-CLIENT/hello?name="+name, String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
