package com.revature.flashcard.approval.Repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.flashcard.approval.beans.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer>{

	
	
}
