package com.dgn.userDetailservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<?> handle(UserNotFoundException userNotFoundException)
    {
        return new ResponseEntity<>(userNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }
}
