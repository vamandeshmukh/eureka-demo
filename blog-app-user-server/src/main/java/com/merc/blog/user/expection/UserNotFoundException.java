package com.merc.blog.user.expection;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2629259785088120945L;
	
	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String errorMessage) {
		super(errorMessage);
	}

}
