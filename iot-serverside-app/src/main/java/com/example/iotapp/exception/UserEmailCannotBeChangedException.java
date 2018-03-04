package com.example.iotapp.exception;

public class UserEmailCannotBeChangedException extends BusinessValidationException {

    public UserEmailCannotBeChangedException() {
        super("user.email.cannot.be.changed.exception");
    }

}
