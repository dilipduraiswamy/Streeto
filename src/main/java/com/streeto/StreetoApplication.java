package com.streeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class StreetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreetoApplication.class, args);
	}

}
