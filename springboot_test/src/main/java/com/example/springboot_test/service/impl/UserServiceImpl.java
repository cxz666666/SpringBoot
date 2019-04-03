package com.example.springboot_test.service.impl;

import com.example.springboot_test.domain.User;
import com.example.springboot_test.mapper.IUserMapper;
import com.example.springboot_test.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author EDZ
 * @Date 2019/4/3 15:28
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public String login(User user) {
        return userMapper.login(user);
    }
}
