package com.windcoder.qy.module.system.biz;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication()
//@MapperScan("com.windcoder.qy.module.system.dao.mapper.*")
public class SystemServApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemServApplication.class,args);
    }
}
