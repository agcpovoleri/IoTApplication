package com.example.iotapp.repository;

import com.example.iotapp.entity.SensorData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository extends CrudRepository<SensorData, Long> {

}
