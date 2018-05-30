package com.avant.ribbonconsumer.controller;

import com.avant.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: vellerzheng
 * @Description:
 * @Date:Created in 20:10 2018/5/29
 * @Modify By:
 */

@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name")String name) {
        return  service.hello(name);
    }
}
