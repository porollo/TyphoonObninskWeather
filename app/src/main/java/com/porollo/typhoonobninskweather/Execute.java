package com.porollo.typhoonobninskweather;

import com.porollo.typhoonobninskweather.data.GetMetarWeatherData;
import com.porollo.typhoonobninskweather.data.GetWeatherData;

import java.io.IOException;

/**
 * Created by Dmitriy S. Porollo on 14.08.2017.
 */

public class Execute {


    public static void main(String[] args) {

        try {
            GetMetarWeatherData metarWeatherData = new GetMetarWeatherData();

            System.out.println(metarWeatherData.getVko());
            System.out.println(metarWeatherData.getSvo());
            System.out.println(metarWeatherData.getDme());




        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
