package com.avant.serverzipkin.config;

import org.springframework.cloud.sleuth.zipkin2.ZipkinProperties;
import org.springframework.cloud.sleuth.zipkin2.ZipkinRestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @Author: vellerzheng
 * @Description:
 * @Date:Created in 16:54 2018/5/31
 * @Modify By:
 */
@Configuration
public class ZipkinConfig {
    @Bean
    ZipkinRestTemplateCustomizer myCustomizer() {
        return new ZipkinRestTemplateCustomizer() {

            @Override
            public void customize(RestTemplate restTemplate) {

            }
        };
    }


}
