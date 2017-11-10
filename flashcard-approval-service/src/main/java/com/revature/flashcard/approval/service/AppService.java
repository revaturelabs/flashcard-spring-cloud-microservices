package com.revature.flashcard.approval.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.flashcard.approval.Repository.QuestionRepository;
import com.revature.flashcard.approval.beans.Question;

@Service
@Transactional
public class AppService {

	@Autowired
	private QuestionRepository qRepo;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	public boolean addPendingQuestion(Question q){
		qRepo.save(q);
		return true;
	}
	
	public boolean updatePending(String qId, String decNum){
		if(Integer.getInteger(decNum) == 1){
			qRepo.delete(Integer.getInteger(qId));
			return true;
		}else if (Integer.getInteger(decNum) == 2){
			
//			Question q = qRepo.findOne(Integer.getInteger(qId));
//			String url = "http://localhost:8765/flashcard-question-bank-service/addApprovedQuestion";
//			
//			restTemplate.exchange(url,new ResponseEntity<Question>(q,HttpStatus.OK));
		}
		
		return true;
		
	}
}
