package com.avant.serverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
//该部分存在问题，@EnableZipkinServer 无法引入
//@EnableZipkinServer
public class ServiceZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZipkinApplication.class, args);
	}
}
