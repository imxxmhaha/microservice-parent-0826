package cn.xxm.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxm
 * @create 2018-08-26 13:19
 */
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig(){
        String str = "applicationName:"+applicationName+"\t eurekaServers:"+eurekaServers +"\t port:" + port;
        System.out.println("********str:" + str);
        return str;
    }

}
