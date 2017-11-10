package com.revature.flashcard.questionbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FlashcardQuestionBankServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashcardQuestionBankServiceApplication.class, args);
	}
}
