package com.example.iotapp.service;

import com.example.iotapp.dto.AuthenticatedUserResponse;
import com.example.iotapp.entity.UserLogin;
import com.example.iotapp.exception.UserNotLoggedException;

public interface UserLoginService {

    UserLogin findByUsername(String username);
//    User findUserByAuthToken(String authToken) throws UserNotLoggedException;
    UserLogin findOne(Long id);
    void logout(String authSessionToken);
//
    AuthenticatedUserResponse getAuthenticatedUserFromToken(String token) throws UserNotLoggedException;
    AuthenticatedUserResponse login(String login, String hash);
////    AuthenticatedUser loginFromFacebook(String oauthCode);
////
    AuthenticatedUserResponse refreshToken(String authSessionToken);
//    int countActiveUserSessions();
//
//    void validate(UserLogin userLogin);
//
//    void updateFieldsToRecoverPassword(UserLogin userLogin);
//
//    void updateUsersPassword(UserLogin userLogin, String newPassword);

}
