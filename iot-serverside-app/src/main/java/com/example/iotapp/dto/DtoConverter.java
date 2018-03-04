package com.example.iotapp.dto;


import com.example.iotapp.entity.SensorCategoryType;
import com.example.iotapp.entity.SensorData;
import com.example.iotapp.entity.User;
import com.example.iotapp.entity.UserLogin;

public class DtoConverter {

    public static User buildUserFromCreateRequest(UserCreateRequest request) {

        final User newUser = new User();
        newUser.setName(request.getFirstName() + " " + request.getLastName());
        newUser.setEmail(request.getEmail());

        final UserLogin userLogin = new UserLogin();
        userLogin.setUsername(request.getUsername());
        userLogin.setPassword(request.getPassword());
        userLogin.setUser(newUser);

        newUser.setUserLogin(userLogin);
        return newUser;
    }

    public static User buildUserFromUpdateRequest(UserUpdateRequest request) {

        final User newUser = new User();
        newUser.setId(request.getId());
        newUser.setName(request.getName());
        newUser.setEmail(request.getEmail());

        final UserLogin userLogin = new UserLogin();
        userLogin.setUsername(request.getUsername());
        userLogin.setPassword(request.getPassword());
        userLogin.setUser(newUser);

        newUser.setUserLogin(userLogin);
        return newUser;
    }

    public static UserDetailResponse buildUserDetail(User user) {

        final UserDetailResponse userDetail = new UserDetailResponse();
        userDetail.setId(user.getId());
        userDetail.setName(user.getName());
        userDetail.setEmail(user.getEmail());
        userDetail.setUsername(user.getUserLogin().getUsername());

        return userDetail;
    }

    public static SensorDataDetailResponse buildSensorDataDetail(SensorData sensorData) {

        final SensorDataDetailResponse sensorDataDetail = new SensorDataDetailResponse();
        sensorDataDetail.setCategory(sensorData.getCategoryType().getName());
        sensorDataDetail.setContent(sensorData.getContent());
        sensorDataDetail.setCreateTimestamp(sensorData.getCreateTimestamp().toString());
        return sensorDataDetail;
    }

    public static SensorData buildSensorDataFromRequest(SensorDataRequest request) {
        final SensorData sensorData = new SensorData();
        sensorData.setCategoryType(SensorCategoryType.GENERIC);
        sensorData.setSourceUID(request.getSourceUID());
        sensorData.setContent(request.getData());

        return sensorData;
    }
}
