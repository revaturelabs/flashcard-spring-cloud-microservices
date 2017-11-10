package com.revature.flashcard.approval.web;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.flashcard.approval.beans.Category;
import com.revature.flashcard.approval.beans.Question;
import com.revature.flashcard.approval.service.AppService;

@RestController
public class ApprovalCtrl {

	@Autowired
	private AppService appService;
	
	@GetMapping("/")
	public String approval(){
		System.out.println("Approval base /");
		return "Approval Service";
	}
	
	@PostMapping("/add")
	public int addPendingQuestion(@RequestParam String question, @RequestParam String answer, @RequestParam String category){
		System.out.println("Adding a question to Approval-DB");
		Question q = new Question(question,answer, new Category(category));
		appService.addPendingQuestion(q);
		return HttpStatus.SC_OK;
	}
	
	@PostMapping("/update")
	public int updatePendingQuestion(@RequestParam String qId, @RequestParam String decNum){
		System.out.println("Updating approval for quesiton id " + qId);
		boolean b = appService.updatePending(qId, decNum);
//		if(b == true){
			return HttpStatus.SC_OK;
//		}else{
//			return HttpStatus.SC_BAD_REQUEST;
//		}
	}
	
}
