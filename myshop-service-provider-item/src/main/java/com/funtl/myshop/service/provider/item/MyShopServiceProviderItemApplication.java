package com.funtl.myshop.service.provider.item;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(scanBasePackages = "com.funtl.myshop")
@EnableDiscoveryClient
@MapperScan(basePackages = "com.funtl.myshop.commons.mapper")
@EnableSwagger2
public class MyShopServiceProviderItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceProviderItemApplication.class, args);
    }
}