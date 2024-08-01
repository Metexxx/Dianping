package com.hmdp;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testString(){
        redisTemplate.opsForValue().set("name", "李四");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);
    }
}
