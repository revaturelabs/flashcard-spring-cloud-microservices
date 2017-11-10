package com.revature.flashcard.user.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FcUser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(nullable=false)
	private String username;
	@Column(unique=true,nullable=false)
	private String password;
	@Column(nullable=false)
	private boolean isTrainer;
	
	public FcUser() {
	}
	
	
	public FcUser(String username, String password, boolean isTrainer) {
		super();
		this.username = username;
		this.password = password;
		this.isTrainer = isTrainer;
	}


	public FcUser(int id, String username, String password, boolean isTrainer) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.isTrainer = isTrainer;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isTrainer() {
		return isTrainer;
	}

	public void setTrainer(boolean isTrainer) {
		this.isTrainer = isTrainer;
	}

	@Override
	public String toString() {
		return "FcUser [id=" + id + ", username=" + username + ", password=" + password + ", isTrainer=" + isTrainer
				+ "]";
	}

	
}
