package com.porollo.typhoonobninskweather;

import com.porollo.typhoonobninskweather.data.GetWeatherData;

import java.io.IOException;

/**
 * Created by Dmitriy S. Porollo on 14.08.2017.
 */

public class Execute {


    public static void main(String[] args) {

        try {
            GetWeatherData getWeatherData = new GetWeatherData();
            System.out.println(getWeatherData.getTemp8());
            System.out.println(getWeatherData.getTemp25());
            System.out.println(getWeatherData.getTemp73());
            System.out.println(getWeatherData.getTemp121());
            System.out.println(getWeatherData.getTemp217());
            System.out.println(getWeatherData.getTemp300());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(getWeatherData.getWind8());
            System.out.println(getWeatherData.getWind25());
            System.out.println(getWeatherData.getWind73());
            System.out.println(getWeatherData.getWind121());
            System.out.println(getWeatherData.getWind217());
            System.out.println(getWeatherData.getWind300());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
