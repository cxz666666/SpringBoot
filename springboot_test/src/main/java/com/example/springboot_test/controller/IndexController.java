package com.example.springboot_test.controller;

import com.example.springboot_test.domain.User;
import com.example.springboot_test.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author EDZ
 * @Date 2019/4/3 15:13
 * @Version 1.0
 **/
@Controller
public class IndexController {

    private static final String LOGIN = "login";
    private static final String INDEX = "index";

    @Resource
    private IUserService userService;

    @RequestMapping("/show")
    public String getIndex(){
        return LOGIN;
    }

    @RequestMapping("/user/login")
    public String login(String name, String pwd){
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        String num = userService.login(user);
        if (num != null) {
            return INDEX;
        } else {
            return getIndex();
        }
    }
}
