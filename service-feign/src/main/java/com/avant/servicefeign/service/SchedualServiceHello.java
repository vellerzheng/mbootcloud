package com.avant.servicefeign.service;

import com.avant.servicefeign.service.impl.SchedualServiceHihystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @Author: vellerzheng
 * @Description:
 * @Date:Created in 21:55 2018/5/29
 * @Modify By:
 *
 */

@FeignClient(value="eureka-client",fallback = SchedualServiceHihystric.class)
public interface SchedualServiceHello {
    @RequestMapping(value = "/hello")
    String sayHelloFromClientOne(@RequestParam("name") String name);

    @RequestMapping(value = "/hi")
    String sayHiFromClientOne();
}
