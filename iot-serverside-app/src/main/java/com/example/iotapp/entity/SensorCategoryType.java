package com.example.iotapp.entity;

import java.util.HashMap;
import java.util.Map;

public enum SensorCategoryType {

    GENERIC(1, "Generic sensor data"),
    WEATHER(2, "Weather condition"),
    VEHICLE(3, "Car location"),
    LIGHT(4, "Lights ");

    private Integer codigo;
    private String name;

    SensorCategoryType(Integer codigo, String name) {

        this.codigo = codigo;
        this.name = name;
    }

    private static Map<Integer, SensorCategoryType> map = new HashMap<Integer, SensorCategoryType>();

    static {
        for (SensorCategoryType categoryTypeEnum : SensorCategoryType.values()) {
            map.put(categoryTypeEnum.codigo.intValue(), categoryTypeEnum);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
