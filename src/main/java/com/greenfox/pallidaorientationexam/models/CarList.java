package com.greenfox.pallidaorientationexam.models;

import java.util.List;

public class CarList {

    private String result;
    private List<Car> data;

    public CarList(String result, List<Car> data) {
        this.result = result;
        this.data = data;
    }

    public CarList() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Car> getData() {
        return data;
    }

    public void setData(List<Car> data) {
        this.data = data;
    }
}
