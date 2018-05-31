package com.avant.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: vellerzheng
 * @Description:
 * @Date:Created in 18:28 2018/5/30
 * @Modify By:
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${foo}")
    String foo;

    @Value("${democonfigclient.message}")
    String message;

    @RequestMapping(value = "/foo")
    public String getFoo(){
        return foo;
    }

    @RequestMapping(value = "/message")
    public String getMessage(){
        return message;
    }
}
