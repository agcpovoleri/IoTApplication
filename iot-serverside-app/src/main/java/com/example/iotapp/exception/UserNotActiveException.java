package com.example.iotapp.exception;


public class UserNotActiveException extends BusinessValidationException {

    public UserNotActiveException() {
        super("user.not.active.exception");
    }

}