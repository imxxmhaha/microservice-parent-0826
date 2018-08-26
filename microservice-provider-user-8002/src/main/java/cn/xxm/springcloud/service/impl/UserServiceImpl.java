package cn.xxm.springcloud.service.impl;

import cn.xxm.springcloud.dao.UserDao;
import cn.xxm.springcloud.pojo.User;
import cn.xxm.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xxm
 * @create 2018-07-29 22:59
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findOne(Long id) {
        return userDao.selectByPrimaryKey(id);
    }
}
