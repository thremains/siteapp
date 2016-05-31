package com.job.siteapp;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * 用JavaConfig的方式配置bean
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Value("${mywebs.datasource.url}")
    private String jdbcUrl;
    @Value("${mywebs.datasource.username}")
    private String username;
    @Value("${mywebs.datasource.password}")
    private String password;

    /**
     * 数据�?
     */
    @Bean(initMethod = "init", destroyMethod = "close")
    DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(jdbcUrl);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        
        return druidDataSource;
    }
    
}
