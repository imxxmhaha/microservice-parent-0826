package cn.xxm.springcloud.controller;

import cn.xxm.springcloud.pojo.User;
import cn.xxm.springcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxm
 * @create 2018-07-29 23:21
 */
@RestController
@RequestMapping("/consumer/user")
public class UserController_Consumer {

    @Autowired
    private UserClientService userClientService;

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userClientService.getUser(id);
    }
}
