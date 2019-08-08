package com.cg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.DOM.CustomResponse;
import com.cg.exceptions.UserNameAlreadyExistsException;

@ControllerAdvice(basePackages = {"com.cg.controller"})
public class ExceptionAspectController {
	@ExceptionHandler(UserNameAlreadyExistsException.class)
	public ResponseEntity<CustomResponse> handleUserNameAlreadyExistsException(UserNameAlreadyExistsException e){
		CustomResponse response = new CustomResponse(e.getMessage());
		return new ResponseEntity<CustomResponse>(response, HttpStatus.IM_USED);
	}
}
