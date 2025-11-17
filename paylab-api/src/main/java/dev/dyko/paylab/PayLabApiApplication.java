package dev.dyko.paylab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.dyko.paylab.api", "dev.dyko.paylab.core"})
@EntityScan(basePackages = "dev.dyko.paylab.core.entity")
@EnableJpaRepositories(basePackages = "dev.dyko.paylab.core.repository")
class PayLabApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayLabApiApplication.class, args);
    }
}
