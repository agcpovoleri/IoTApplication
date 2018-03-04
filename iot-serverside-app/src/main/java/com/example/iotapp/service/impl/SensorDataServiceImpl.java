package com.example.iotapp.service.impl;

import com.example.iotapp.entity.SensorData;
import com.example.iotapp.repository.SensorDataRepository;
import com.example.iotapp.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SensorDataServiceImpl implements SensorDataService {

    @Autowired
    private SensorDataRepository sensorDataRepository;

    @Override
    public void create(SensorData sensorData) {

        sensorDataRepository.save(sensorData);
    }

    @Override
	public SensorData findOne(Long id) {
		return sensorDataRepository.findOne(id);
	}

    public List<SensorData> findAll() {
		return (List<SensorData>) sensorDataRepository.findAll();
	}
}
