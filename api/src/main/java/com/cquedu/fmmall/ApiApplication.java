package com.cquedu.fmmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cquedu.fmmall.dao")
//必须加注释让主类扫描
@ComponentScan(basePackages = {"com.cqudu.fmmall.service","com.cquedu.fmmall.controller"} )
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
