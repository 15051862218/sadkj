package com.syk.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.syk.boot.mapper"})
public class BootMysqltestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMysqltestApplication.class, args);
    }

}
