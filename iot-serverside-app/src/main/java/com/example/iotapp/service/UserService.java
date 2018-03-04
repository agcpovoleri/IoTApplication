package com.example.iotapp.service;

import com.example.iotapp.entity.User;
import com.example.iotapp.exception.UserAlreadyExistException;
import com.example.iotapp.exception.UserEmailAlreadyUsedException;

import java.util.List;

public interface UserService {

    User findOne(Long id);
    User findByEmail(String email);

    List<User> findAll();
    void createUser(User user) throws UserAlreadyExistException, UserEmailAlreadyUsedException;
    void update(User user);
	void delete(Long id);
}
