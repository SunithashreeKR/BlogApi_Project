package com.wissen.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wissen.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> userNotFoundException(UserNotFoundException exception) {

		ErrorResponse response = new ErrorResponse();
		response.setStatus(exception.getMessage());
		response.setMessage("Id not found");
		response.setErrorcode(404);

		return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);

	}
}
