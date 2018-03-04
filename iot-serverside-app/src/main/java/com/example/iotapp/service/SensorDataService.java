package com.example.iotapp.service;

import com.example.iotapp.entity.SensorData;
import com.example.iotapp.entity.User;
import com.example.iotapp.exception.UserAlreadyExistException;
import com.example.iotapp.exception.UserEmailAlreadyUsedException;

import java.util.List;

public interface SensorDataService {

    void create(SensorData sensorData);

    SensorData findOne(Long id);
    List<SensorData> findAll();


}
