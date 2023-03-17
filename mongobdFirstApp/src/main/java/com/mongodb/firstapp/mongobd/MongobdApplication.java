package com.mongodb.firstapp.mongobd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.mongodb.firstapp.mongobd.repository")
@ComponentScan("com.mongodb.firstapp.*")
public class MongobdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongobdApplication.class, args);
	}

}
