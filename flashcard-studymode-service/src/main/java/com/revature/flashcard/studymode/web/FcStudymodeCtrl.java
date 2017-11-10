package com.revature.flashcard.studymode.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FcStudymodeCtrl {

	@GetMapping("/")
	public String baseStudymode() {
		System.out.println("studymode service -get");
		return "Study mode service";

	}


}
