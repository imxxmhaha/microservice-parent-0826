package cn.xxm.springcloud;

import cn.xxm.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableCaching
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类,从而使配置生效
@RibbonClient(name="MICROSERVICE-PROVIDER-USER",configuration = MySelfRule.class)
public class ConsumerUserApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApp.class, args);
    }
}
