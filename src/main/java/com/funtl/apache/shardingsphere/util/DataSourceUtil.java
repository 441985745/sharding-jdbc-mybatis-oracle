package com.funtl.apache.shardingsphere.util;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DataSourceUtil {
    private static final String HOST = "192.168.1.205";
//jdbc:oracle:thin:@192.168.1.205:1521:orclutf8
    private static final int PORT = 1521;


    private static final String PASSWORD = "123456";

    public static DataSource createDataSource(String username) {
        HikariDataSource result = new HikariDataSource();
        result.setDriverClassName(oracle.jdbc.OracleDriver.class.getName());
        result.setJdbcUrl("jdbc:oracle:thin:@192.168.1.205:1521:orclutf8");
        result.setUsername(username);
        result.setPassword(PASSWORD);
        return result;
    }
}
