package com.revature.flashcard.user.web;

import com.revature.flashcard.user.bean.FcUserToken;
import com.revature.flashcard.user.bean.LoginService;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.revature.flashcard.user.bean.FcUser;

@RestController
public class FcUserCtrl {

	private LoginService service;

	@Autowired
	public FcUserCtrl(LoginService loginService){
		this.service = loginService;
	}

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
	
	@PostMapping(value = "/login")
	public ResponseEntity<FcUserToken> login(@RequestBody FcUser user){
		System.out.println(user.getUsername());
		String token = service.loginUser(user);
		System.out.println(token);

		FcUserToken ut = new FcUserToken();
		ut.setToken(token);
		ut.setExpiresInSeconds(3600);

		if(token != null) {
			return new ResponseEntity<>(ut, HttpStatus.OK);
		}else {
			return new ResponseEntity<>((FcUserToken) null, HttpStatus.UNAUTHORIZED);
		}
	}

	@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FcUserToken> getCurrentUser(@RequestParam String token) {
		FcUserToken userToken = new FcUserToken();
		HttpStatus status = HttpStatus.OK;

		userToken = service.getUser(token);
		if(userToken == null) {
			status = HttpStatus.UNAUTHORIZED;
		}
		return new ResponseEntity<>(userToken, status);
	}
}
