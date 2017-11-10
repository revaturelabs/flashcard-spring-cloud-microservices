package com.revature.flashcard.studymode.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
//@Table
public class Category {
/*
	@Id
	@Column(name="c_id")*/
	private int id;
	private String catName;
/*	
	@OneToMany
	@JoinColumn(name="c_id")*/
	private List<Question> question;
	
	public Category() {
	}

	public Category(int id, String catName) {
		super();
		this.id = id;
		this.catName = catName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", catName=" + catName + "]";
	}

}
