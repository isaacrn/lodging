package lodging.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"lodging"})
@EntityScan(basePackages = {"lodging"})
@ComponentScan(basePackages = {"lodging"})
public class LodgingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LodgingApplication.class, args);
    }
}
