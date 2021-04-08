package com.akhilesh.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/**
 * User: Akhilesh Pandey
 */
@SpringBootApplication
@EnableJpaAuditing
public class SpringJpaOracleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaOracleDemoApplication.class, args);
    }
}
