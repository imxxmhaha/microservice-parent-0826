package cn.xxm.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xxm
 * @create 2018-08-18 22:31
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule();//Ribbon默认是轮训,我自定义为随机
//        return new RoundRobinRule();//Ribbon默认是轮训,我自定义为随机
        return new RandomRule_XXM(); //自定义规则,每个服务接待5次之后,换下一个服务接待五次
    }
}
