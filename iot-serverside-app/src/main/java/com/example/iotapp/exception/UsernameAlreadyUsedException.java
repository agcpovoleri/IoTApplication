package com.example.iotapp.exception;

public class UsernameAlreadyUsedException extends BusinessValidationException {

    public UsernameAlreadyUsedException() {
        super("username.already.used.exception");
    }

}
