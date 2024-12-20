package com.practica.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.practica.bus")  
public class SpringBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBusApplication.class, args);
    }
}
