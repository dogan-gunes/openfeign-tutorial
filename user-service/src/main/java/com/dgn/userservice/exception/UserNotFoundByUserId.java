package com.dgn.userservice.exception;

public class UserNotFoundByUserId extends RuntimeException {
    public UserNotFoundByUserId(String message) {
        super(message);
    }
}
