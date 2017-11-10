package com.revature.flashcard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.flashcard.bean.FlashCard;

@RestController
public class FlashCardCtrl {

	@GetMapping("/")
	public String getFc(){
		System.out.println("fc get");
		return "Hello MicroService FlashCard";
	}
}
