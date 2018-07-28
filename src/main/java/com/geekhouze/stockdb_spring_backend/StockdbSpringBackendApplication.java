package com.geekhouze.stockdb_spring_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.geekhouze.stockdb_spring_backend.repository")
@SpringBootApplication
public class StockdbSpringBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockdbSpringBackendApplication.class, args);
    }
}
