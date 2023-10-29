package com.merc.blog.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Geo")
public class Geo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
    private Integer geoId;
	
	@Column (name = "latitude")
	private String lat;
	
	@Column (name = "longitude")
    private String lng;
    
	@OneToOne
    private User user;

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	public Geo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Geo(String lat, String lng, User user) {
		super();
		this.lat = lat;
		this.lng = lng;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Geo [lat=" + lat + ", lng=" + lng + ", user=" + user + "]";
	}

}
