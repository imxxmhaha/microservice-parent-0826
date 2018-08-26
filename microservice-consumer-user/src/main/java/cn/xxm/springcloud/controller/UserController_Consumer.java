package cn.xxm.springcloud.controller;

import cn.xxm.springcloud.pojo.User;
import cn.xxm.springcloud.spring.aop.LoggerManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xxm
 * @create 2018-07-29 23:21
 */
@RestController
@RequestMapping("/consumer/user")
public class UserController_Consumer {

//    public static final String REST_URL_PREFIX="http://localhost:8080/";
    public static final String REST_URL_PREFIX="http://MICROSERVICE-PROVIDER-USER/";

    @Autowired
    private RestTemplate restTemplate;

    @LoggerManage(description = "restTemplate调用服务")
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Long id){
        User user = restTemplate.getForObject(REST_URL_PREFIX +"user/getUser/"+ id, User.class);
        return user;
    }

    //测试@EnableDiscoveryClient,消费端可以调用服务发现
    @GetMapping("/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"user/discovery",Object.class);
    }

}
