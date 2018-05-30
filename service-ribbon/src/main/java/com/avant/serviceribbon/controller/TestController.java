package com.avant.serviceribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: vellerzheng
 * @Description:
 * @Date:Created in 21:06 2018/5/29
 * @Modify By:
 */
@RestController
public class TestController {

    @RequestMapping(value = "/hi")
    public String hello() {
        return  "hi, jfajklj!";
    }
}
