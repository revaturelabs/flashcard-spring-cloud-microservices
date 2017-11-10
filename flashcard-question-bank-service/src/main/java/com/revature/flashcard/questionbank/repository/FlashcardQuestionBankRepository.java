package com.revature.flashcard.questionbank.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.flashcard.questionbank.beans.Question;

public interface FlashcardQuestionBankRepository extends CrudRepository<Question, Integer>{

	
	
}
