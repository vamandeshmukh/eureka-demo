package com.merc.blog.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
    private Integer userId;
	
	@Column (name = "name")
    private String name;
	
	@Column (name = "username")
    private String username;
	
	@Column (name = "email")
    private String email;
	
	@OneToOne(mappedBy = "user")
    private Address address;
	
	@OneToOne(mappedBy = "user")
    private Geo geo;
	
	@Column (name = "phone")
    private String phone;
	
	@Column (name = "website")
    private String website;
	
	@OneToOne(mappedBy = "user")
    private Company company;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Geo getGeo() {
		return geo;
	}

	public void setGeo(Geo geo) {
		this.geo = geo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String name, String username, String email, Address address, Geo geo, String phone,
			String website, Company company) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.geo = geo;
		this.phone = phone;
		this.website = website;
		this.company = company;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", address=" + address + ", geo=" + geo + ", phone=" + phone + ", website=" + website + ", company="
				+ company + "]";
	}

}

