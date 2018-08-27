package cn.xxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApp_9001 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApp_9001.class,args);
    }
}
