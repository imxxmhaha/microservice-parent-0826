package cn.xxm.springcloud.service;

import cn.xxm.springcloud.pojo.User;

/**
 * @author xxm
 * @create 2018-07-29 22:58
 */
public interface UserService {
    User findOne(Long id);
}
