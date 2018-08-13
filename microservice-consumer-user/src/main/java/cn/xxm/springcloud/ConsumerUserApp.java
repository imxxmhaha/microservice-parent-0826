package cn.xxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ConsumerUserApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApp.class, args);
    }
}
