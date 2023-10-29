package com.merc.blog.post.exception;

public class PostNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 3812709397804342045L;
	
	public PostNotFoundException() {
		super();
	}

	public PostNotFoundException(String errorMessage) {
		super(errorMessage);
	}

}
