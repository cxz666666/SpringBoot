package net.xdclass.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisClient {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 存值
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, String value){
        try {
            stringRedisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 取值
     * @param key
     * @return
     */
    public String get(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }

}
