package com.porollo.typhoonobninskweather.data.db.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Dmitriy S. Porollo on 14.08.2017.
 */

public class WeatherRealModel extends RealmObject {

    @PrimaryKey
    private long id;
    private String height;
    private float temperature;
    private float humidity;
    private float wind;

    public long getId() {
        return id;
    }
    public String getHeight() {
        return height;
    }
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getWind() {
        return wind;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public void setWind(float wind) {
        this.wind = wind;
    }

}
