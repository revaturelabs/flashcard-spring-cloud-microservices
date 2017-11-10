package com.revature.flashcard.questionbank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.flashcard.questionbank.beans.Category;
import com.revature.flashcard.questionbank.repository.FlashcardQuestionBankCategoryRepository;

@Service
public class CategoryService {

	
	@Autowired private FlashcardQuestionBankCategoryRepository repository;

	@Transactional
	public List<Category> allCategories(){
		
		return (List<Category>) repository.findAll();
		
	}
	
}
