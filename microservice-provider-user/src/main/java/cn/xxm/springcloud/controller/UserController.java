package cn.xxm.springcloud.controller;

import cn.xxm.springcloud.pojo.User;
import cn.xxm.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xxm
 * @create 2018-07-29 22:55
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Long id){
        User user = userService.findOne(id);
//        throw new  RuntimeException();
        return user;
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("******"+list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICE-PROVIDER-USER");
        for(ServiceInstance instance : srvList ){
            System.out.println(instance.getServiceId() + "\t" +instance.getHost() +"\t" +instance.getPort()+"\t"
            + instance.getUri());
        }
        return this.client;
    }

}
