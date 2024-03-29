package com.mooc.sb.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/24 11:29
 **/
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    public boolean set(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean set(String key, Object value, long time) {
        try {
            redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Object get(String key){
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    public long incr(String key, long delta){
        if (delta<0)
            throw new RuntimeException("递增因子必像大于0");
        return redisTemplate.opsForValue().increment(key, delta);
    }

    public long decr(String key, long delta){
        if (delta<0)
            throw new RuntimeException("递减因子必须大于0");
        return redisTemplate.opsForValue().increment(key, -delta);
    }
}
