package dev.dyko.paylab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages = "dev.dyko.paylab"
                     , exclude = {
                            DataSourceAutoConfiguration.class,
                            HibernateJpaAutoConfiguration.class})   // DB 셋팅 후 제거
class PayLabApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayLabApiApplication.class, args);
    }

}
