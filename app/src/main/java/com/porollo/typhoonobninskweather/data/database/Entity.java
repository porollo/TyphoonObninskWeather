package com.porollo.typhoonobninskweather.data.database;

import io.realm.RealmObject;

/**
 * Created by Dmitriy S. Porollo on 14.08.2017.
 */

public class Entity extends RealmObject {

    public Entity() {
    }

    private long id;
    private int height;
    private float temperature;
    private float humidity;
    private float wind;

    public long getId() {
        return id;
    }
    public Integer getHeight() {
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
    public void setHeight(Integer height) {
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
