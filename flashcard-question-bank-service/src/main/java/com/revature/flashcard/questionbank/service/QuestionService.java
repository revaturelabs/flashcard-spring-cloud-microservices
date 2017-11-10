package com.revature.flashcard.questionbank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.flashcard.questionbank.beans.Question;
import com.revature.flashcard.questionbank.repository.FlashcardQuestionBankRepository;

@Service
public class QuestionService {

	@Autowired private FlashcardQuestionBankRepository repository;

	@Transactional
	public List<Question> allQuestions(){
		
		return (List<Question>) repository.findAll();
		
	}
	
}
