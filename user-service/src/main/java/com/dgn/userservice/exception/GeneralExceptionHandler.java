package com.dgn.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler(UserNotFoundByUserId.class)
    public ResponseEntity<?> handle(UserNotFoundByUserId userNotFoundByUserId){
        return new ResponseEntity<>(userNotFoundByUserId.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ExceptionMessage> handle(UserNotFoundException userNotFoundException){
        return new ResponseEntity<>(userNotFoundException.getExceptionMessage(), HttpStatus.resolve(userNotFoundException.getExceptionMessage().getStatus()));
    }
}
