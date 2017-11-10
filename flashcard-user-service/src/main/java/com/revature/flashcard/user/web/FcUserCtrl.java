package com.revature.flashcard.user.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.flashcard.user.bean.FcUser;

@RestController
public class FcUserCtrl {

	@GetMapping("/")
	public String baseUser(){
		System.out.println("user service -get");
		return "user service";
	}
	
//	@PostMapping("/login")
//	public ResponseEntity<FcUser> login(@RequestParam FcUser fcUser){
//		System.out.println("login -post");
//		return new ResponseEntity<FcUser>(new FcUser(1, "steve", "123",true),HttpStatus.OK);
//	}
	
	@PostMapping("/login")
	public ResponseEntity<FcUser> login(@RequestParam String fcUser){
		System.out.println("login -post" + fcUser);
		return new ResponseEntity<FcUser>(new FcUser(1, "steve", "123",true),HttpStatus.OK);
	}
}
