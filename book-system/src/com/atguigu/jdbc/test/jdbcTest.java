package com.atguigu.jdbc.test;
import com.atguigu.jdbc.util.jdbcUtil;

import java.sql.Connection;

public class jdbcTest {
    public static void main(String[] args) {
        Connection jdbcConnection = jdbcUtil.getJdbcConnection();
        System.out.println(jdbcConnection);

    }
}
