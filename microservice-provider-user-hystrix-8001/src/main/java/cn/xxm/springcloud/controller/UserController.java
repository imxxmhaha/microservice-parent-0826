package cn.xxm.springcloud.controller;

import cn.xxm.springcloud.pojo.User;
import cn.xxm.springcloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")//一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    public User getUser(@PathVariable("id") Long id) {
        User user = userService.findOne(id);
        if (null == user) {
            throw new RuntimeException("查询不到该id:" + id + "对应的用户信息");
        }
        return user;
    }

    public User processHystrix_Get(@PathVariable("id") Long id){
        return new User().setId(id).setUsername("该ID:"+id+"没有对应的用户信息,null--@HystrixCommand")
                .setEmail("no this database in MySql");
    }

}
