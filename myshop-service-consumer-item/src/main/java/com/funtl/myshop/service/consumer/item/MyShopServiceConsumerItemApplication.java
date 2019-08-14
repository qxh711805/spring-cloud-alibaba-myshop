package com.funtl.myshop.service.consumer.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.funtl.myshop", exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class MyShopServiceConsumerItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceConsumerItemApplication.class, args);
    }
}
