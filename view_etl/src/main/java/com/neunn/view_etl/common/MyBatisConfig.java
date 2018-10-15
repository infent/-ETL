package com.neunn.view_etl.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

//springboot 集成mybatis的基本入口，创建数据源（如果采用的默认tomcat-jdbc，则不需要）
//创建sqlSessionFactory
//配置事务管理器
@Configuration
@MapperScan(basePackages = "com.neunn.view_etl.mapper")
public class MyBatisConfig {
    @Autowired
    Environment env;

    //创建数据源
    @Bean
    public DataSource airflowdbDataSource() throws Exception{
        Properties props = new Properties();
        props.put("driverClassName",env.getProperty("jdbc.driverClassName"));
        props.put("url",env.getProperty("jdbc.url"));
        props.put("username",env.getProperty("jdbc.username"));
        props.put("password",env.getProperty("jdbc.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }

}
