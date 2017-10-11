package com.porollo.typhoonobninskweather.data;


import java.io.IOException;

import io.reactivex.Flowable;

/**
 * Created by Dmitriy S. Porollo on 11.10.2017.
 */

public class GetWeatherDataLong{

    public static void main(String[] args) throws IOException {

        Flowable.just("Hello world").subscribe(System.out::println);

        GetWeatherData getWeatherData = new GetWeatherData();

        getWeatherData.getTempMap();



    }

}


