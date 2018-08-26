package cn.xxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableCaching
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.xxm.springcloud"})
public class ConsumerUser_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUser_Feign_App.class, args);
    }
}
