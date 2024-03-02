package com.onesoft.firstproject.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(Brandnotfoundexception.class)
    public ResponseEntity<Object> Brandnotfoundexceptionhandling(Brandnotfoundexception e){          //http response
	return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
}
	@ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> NoSuchElementExceptionhandling(NoSuchElementException r){          //http response
	return new ResponseEntity<>(r.getMessage(),HttpStatus.NOT_FOUND);
	}
}



