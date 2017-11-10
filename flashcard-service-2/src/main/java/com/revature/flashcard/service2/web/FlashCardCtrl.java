package com.revature.flashcard.service2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.flashcard.service2.bean.FlashCard;

@RestController
public class FlashCardCtrl {

	@GetMapping("/fc")
	public FlashCard getFlashCard(){
		System.out.println("Service 2 Get FlashCard");
		return new FlashCard(1,"question","answer");
	}
}
