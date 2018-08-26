package cn.xxm.springcloud.service;

import cn.xxm.springcloud.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 修改microservicecloud-api工程，
 * 根据已经有的DeptClientService接口新建一个实现了
 * FallbackFactory接口的类DeptClientServiceFallbackFactory
 *
 * @author xxm
 * @create 2018-08-23 23:43
 */
//@FeignClient(value = "MICROSERVICE-PROVIDER-USER")
@FeignClient(value = "MICROSERVICE-PROVIDER-USER",fallbackFactory = UserClientServiceFallbackFactory.class)
public interface UserClientService {

    @GetMapping(value = "/user/getUser/{id}")
    public User getUser(@PathVariable("id") Long id);
}
