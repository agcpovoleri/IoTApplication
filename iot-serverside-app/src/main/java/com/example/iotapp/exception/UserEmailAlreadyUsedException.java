package com.example.iotapp.exception;

public class UserEmailAlreadyUsedException extends BusinessValidationException {

    public UserEmailAlreadyUsedException() {
        super("user.email.already.used.exception");
    }

}
