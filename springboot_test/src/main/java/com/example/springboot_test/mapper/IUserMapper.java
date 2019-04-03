package com.example.springboot_test.mapper;

import com.example.springboot_test.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author EDZ
 * @Date 2019/4/3 15:27
 * @return
 **/

@Repository
public interface IUserMapper {

    /**
     * 登录
     *
     * @param user
     * @return
     */
    String login(User user);
}
