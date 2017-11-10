package com.revature.flashcard.bean;

public class FlashCard {
	
	private int id;
	private String name;
	public FlashCard(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public FlashCard() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FlashCard [id=" + id + ", name=" + name + "]";
	}

}
