package com.employeemgnt.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
public class CompanyNotFoundException extends RuntimeException {
	public CompanyNotFoundException(String message, Throwable cause) {
		super(message , cause);

	}

	public CompanyNotFoundException(String message) {
		super(message);
	}

}
