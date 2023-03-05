package com.dgn.userservice.exception;

import lombok.Getter;

@Getter
public class UserNotFoundException extends RuntimeException{
    private ExceptionMessage exceptionMessage;

    public UserNotFoundException(ExceptionMessage exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
