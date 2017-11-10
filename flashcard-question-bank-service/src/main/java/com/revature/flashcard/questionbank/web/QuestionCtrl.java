package com.revature.flashcard.questionbank.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionCtrl {

	@GetMapping("/")
	public String testQuestion(){
		System.out.println("QuestionCtrl -get");
		return "Get QuestionCtrl";
	}
}
