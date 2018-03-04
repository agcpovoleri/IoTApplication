package com.example.iotapp.dto;

import javax.validation.constraints.NotNull;

public class SensorDataRequest {

    @NotNull
    private String sourceUID;

    @NotNull
    private String type;

    @NotNull
    private String data;

    public String getSourceUID() {
        return sourceUID;
    }

    public void setSourceUID(String sourceUID) {
        this.sourceUID = sourceUID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}