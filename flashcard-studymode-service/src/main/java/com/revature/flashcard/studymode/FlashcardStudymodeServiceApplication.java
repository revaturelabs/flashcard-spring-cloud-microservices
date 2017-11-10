package com.revature.flashcard.studymode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FlashcardStudymodeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashcardStudymodeServiceApplication.class, args);
	}
}
