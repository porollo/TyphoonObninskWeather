package com.porollo.typhoonobninskweather.data;

/**
 * Created by Dmitriy S. Porollo on 24.10.2017.
 */

public interface WeatherData {

    String get8MetersTemperature();
    String get25MetersTemperature();
    String get73MetersTemperature();
    String get121MetersTemperature();
    String get217MetersTemperature();
    String get300MetersTemperature();

    String get8MetersWind();
    String get25MetersWind();
    String get73MetersWind();
    String get121MetersWind();
    String get217MetersWind();
    String get300MetersWind();

}