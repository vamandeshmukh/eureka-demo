package com.merc.blog.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Address")
public class Address {
	
	@Id
	@Column (name = "street")
	private String street;
	
	@Column (name = "suite")
    private String suite;
	
	@Column (name = "city")
    private String city;
	
	@Column (name = "zipcode")
    private String zipcode;
    
	@OneToOne
    private User user;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String suite, String city, String zipcode, User user) {
		super();
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode=" + zipcode + ", user="
				+ user + "]";
	}
	
}
