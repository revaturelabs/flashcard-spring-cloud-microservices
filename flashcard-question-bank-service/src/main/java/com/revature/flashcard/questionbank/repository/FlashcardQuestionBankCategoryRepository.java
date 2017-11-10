package com.revature.flashcard.questionbank.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.flashcard.questionbank.beans.Category;


public interface FlashcardQuestionBankCategoryRepository extends CrudRepository<Category, Integer> {

	
}
