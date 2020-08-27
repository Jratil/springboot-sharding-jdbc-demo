package com.jratil.shardingdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jratil.shardingdemo1.mapper")
@SpringBootApplication
public class ShardingDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(ShardingDemo1Application.class, args);
    }

}
