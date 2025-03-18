package com.fay.faypicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.fay.faypicturebackend.mapper")
public class FayPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FayPictureBackendApplication.class, args);
    }

}
