package com.merc.blog.post.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.merc.blog.post.model.Post;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(PostNotFoundException.class)
	public ResponseEntity<Post> handleEmployeeNotFoundException(PostNotFoundException err) {
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", err.getMessage());
		ResponseEntity<Post> response = new ResponseEntity<Post>(null, headers, status);
		
		return response;
	}

}
