package com.qa.dog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cannot be found" )
public class DogNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	

}
