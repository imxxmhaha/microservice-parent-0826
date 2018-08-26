package cn.xxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerUser_Dashboard_App7001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUser_Dashboard_App7001.class, args);
    }
}
