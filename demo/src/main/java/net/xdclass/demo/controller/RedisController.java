package net.xdclass.demo.controller;

import net.xdclass.demo.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisClient redisClient;

    @RequestMapping("get")
    @ResponseBody
    public String get(){
        return redisClient.get("name");
    }


}
