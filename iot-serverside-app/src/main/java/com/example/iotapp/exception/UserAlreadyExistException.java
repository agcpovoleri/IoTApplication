package com.example.iotapp.exception;

public class UserAlreadyExistException extends BusinessValidationException {

    public UserAlreadyExistException() {
        super("user.already.exist.with.username.exception");
    }

}
