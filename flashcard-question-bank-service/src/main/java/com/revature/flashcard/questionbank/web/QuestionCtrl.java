package com.revature.flashcard.questionbank.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.flashcard.questionbank.beans.Category;
import com.revature.flashcard.questionbank.beans.Question;

@RestController
public class QuestionCtrl {

	@GetMapping("/")
	public String testQuestion() {
		System.out.println("QuestionCtrl -get");
		return "Get QuestionCtrl";
	}

	@GetMapping("/question")
	public ResponseEntity<List<Question>> allQuestions() {

		Question quest = new Question();
		quest.setId(1);
		quest.setQuestion("question1");
		quest.setAnswer("answer1");
		quest.setCategory(new Category(1, "Java"));
		
		  
		List<Question> myQuestion = new ArrayList<>();
		myQuestion.add(quest);
		myQuestion.add(new Question(2,"what is java?", "better than .net", new Category(1, "Java")));
		myQuestion.add(new Question(3,"what is .net?", "not better than java", new Category(1, "Java")));
		myQuestion.add(new Question(4,"what is python?", "also better than .net", new Category(1, "Java")));
		myQuestion.add(new Question(5,"what is C#?", "4 plus signs next to the letter C", new Category(1, "Java")));
		myQuestion.add(new Question(6,"why do Java Developer wear glasses?", "because they can't C#", new Category(1, "Java")));
		myQuestion.add(new Question(7,"what is pizza?", "better than c#", new Category(1, "Java")));
		return new ResponseEntity<>(myQuestion, HttpStatus.OK);

	}

	@GetMapping("/category")
	public ResponseEntity<List<Category>> allCategory(){

		Category category1= new Category(1, "Java");
		List<Category> myCategory= new ArrayList<>();
		myCategory.add(category1);
	return new ResponseEntity<>(myCategory, HttpStatus.OK);

}
}
