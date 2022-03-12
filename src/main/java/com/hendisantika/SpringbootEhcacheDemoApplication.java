package com.hendisantika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootEhcacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEhcacheDemoApplication.class, args);
    }

}
