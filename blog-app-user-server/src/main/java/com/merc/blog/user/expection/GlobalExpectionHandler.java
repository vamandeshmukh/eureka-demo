package com.merc.blog.user.expection;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.merc.blog.user.model.User;

@ControllerAdvice
public class GlobalExpectionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<User> handleEmployeeNotFoundException(UserNotFoundException err) {
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", err.getMessage());
		ResponseEntity<User> response = new ResponseEntity<User>(null, headers, status);
		
		return response;
	}

}
