package com.example.iotapp.exception;

public class UserNotLoggedException extends RuntimeException {

    public UserNotLoggedException() {
        super("user.not.logged.exception");
    }
}
