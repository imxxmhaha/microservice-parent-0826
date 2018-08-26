package cn.xxm.springcloud.service;

import cn.xxm.springcloud.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author xxm
 * @create 2018-08-24 22:56
 */
@Component   //不要忘记添加,不要忘记添加
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {

    @Override
    public UserClientService create(Throwable cause) {
        return new UserClientService() {
            @Override
            public User getUser(Long id) {
                return new User().setId(id).setUsername("该ID:"+id+"没有对应的用户信息,Consumer客户端提供的降级信息,刺客服务Provider已经关闭")
                        .setEmail(".......Provider is down!!");
            }
        };
    }
}
