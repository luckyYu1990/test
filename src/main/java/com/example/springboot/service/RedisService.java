package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisService {
/*
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Resource(name= "stringRedisTemplate")
    ValueOperations<String,String> valOptStr;
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;
    @Resource(name="redisTemplate")
    ValueOperations<Object,Object> valOptObj;

    public String getStr(String key){
        return valOptStr.get(key);
    }

    public void setStr(String key,String value){
        valOptStr.set(key,value);
    }
*/

}
