package com.revature.flashcard.approval.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 *  This Database holds only Pending Questions once Approved/Denied they are removed/deleted from DB
 *  Upon Approval the question will be submitted to the Question Bank Service
 */
@Entity
@Table
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String question;
	private String answer;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Category category;
	
	public Question() {
	}

	public Question(String question, String answer, Category category) {
		super();
		this.question = question;
		this.answer = answer;
		this.category = category;
	}

	public Question(int id, String question, String answer, Category category) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answer=" + answer + ", category=" + category + "]";
	}
	
	
}
