package com.bobby.springtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTasksApplication.class, args);
	}
}
