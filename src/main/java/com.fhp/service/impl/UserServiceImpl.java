package com.fhp.service.impl;

import com.fhp.dao.IUserDao;
import com.fhp.model.User;
import com.fhp.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
