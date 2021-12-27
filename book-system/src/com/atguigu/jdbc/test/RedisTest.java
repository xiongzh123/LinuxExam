package com.atguigu.jdbc.test;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("120.48.15.51",6379);
        System.out.println(jedis.ping());
    }
}
