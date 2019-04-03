package com.example.springboot_test.service;

import com.example.springboot_test.domain.User;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author EDZ
 * @Date 2019/4/3 15:28
 * @return
 **/
public interface IUserService {

    /**
     * 登录
     *
     * @param user
     * @return
     */
    String login(User user);
}
