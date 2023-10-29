package com.merc.blog.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Company")
public class Company {
	
	@Id
	@Column (name = "name")
	private String name;
	
	@Column (name = "catch_phrase")
    private String catchPhrase;
	
	@Column (name = "bs")
    private String bs;
    
	@OneToOne
    private User user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String name, String catchPhrase, String bs, User user) {
		super();
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", catchPhrase=" + catchPhrase + ", bs=" + bs + ", user=" + user + "]";
	}

}
