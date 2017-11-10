package com.revature.flashcard.approval.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Category {

	@Id
	@GeneratedValue
	private int id;
	private String catName;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Question question;
	
	public Category() {
	}

	
	public Category(String catName) {
		super();
		this.catName = catName;
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
