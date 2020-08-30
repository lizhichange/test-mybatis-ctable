package com.example.testmybatisctable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author sunflower
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.testmybatisctable", "com.gitee.sunchenbin.mybatis.actable.manager.*"})
@EnableTransactionManagement
@MapperScan(basePackages = {"com.example.testmybatisctable.dal.dao", "com.gitee.sunchenbin.mybatis.actable.dao.*"})
public class TestMybatisCtableApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMybatisCtableApplication.class, args);
    }

}
