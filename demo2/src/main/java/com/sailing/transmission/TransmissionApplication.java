package com.sailing.transmission;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan(basePackages = "com.sailing.transmission.mapper")
public class TransmissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransmissionApplication.class, args);
    }

}
