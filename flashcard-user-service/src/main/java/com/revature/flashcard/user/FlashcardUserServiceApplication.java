package com.revature.flashcard.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FlashcardUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashcardUserServiceApplication.class, args);
	}
}
