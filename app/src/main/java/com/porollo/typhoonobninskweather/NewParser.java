package com.porollo.typhoonobninskweather;

import com.porollo.typhoonobninskweather.data.WeatherData;


import java.io.IOException;

/**
 * Created by Dmitriy S. Porollo on 23.10.2017.
 */

public class NewParser {

    public static void main(String[] args) throws IOException {

        WeatherData weatherData = new WeatherData();


        System.out.println(weatherData.get8MetersTemperature());
        System.out.println(weatherData.get25MetersTemperature());
        System.out.println(weatherData.get73MetersTemperature());
        System.out.println(weatherData.get121MetersTemperature());
        System.out.println(weatherData.get217MetersTemperature());
        System.out.println(weatherData.get300MetersTemperature());

        System.out.println("...................................");

        System.out.println(weatherData.get8MetersWind());
        System.out.println(weatherData.get25MetersWind());
        System.out.println(weatherData.get73MetersWind());
        System.out.println(weatherData.get121MetersWind());
        System.out.println(weatherData.get217MetersWind());
        System.out.println(weatherData.get300MetersWind());






    }
}
///Exception in thread "main" org.jsoup.HttpStatusException: HTTP error fetching URL. Status=500