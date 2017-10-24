package com.porollo.typhoonobninskweather.data;

import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


/**
 * Created by Dmitriy S. Porollo on 14.08.2017.
 * @return пояснение
 * @
 * @
 */




public class WeatherDataImpl implements WeatherData{

    public WeatherDataImpl() throws IOException {
    }

    private final static String URL = "http://typhoon-tower.obninsk.org/ru/10-minute.asp";
    private final String TAG = "td";

    private static final int HEIGHT_8_TEMPERATURE_PARSING_TAG = 30;
    private static final int HEIGHT_25_TEMPERATURE_PARSING_TAG = 25;
    private static final int HEIGHT_73_TEMPERATURE_PARSING_TAG = 20;
    private static final int HEIGHT_121_TEMPERATURE_PARSING_TAG = 15;
    private static final int HEIGHT_217_TEMPERATURE_PARSING_TAG = 10;
    private static final int HEIGHT_300_TEMPERATURE_PARSING_TAG = 5;

    private static final int HEIGHT_8_WIND_PARSING_TAG = 28;
    private static final int HEIGHT_25_WIND_PARSING_TAG = 23;
    private static final int HEIGHT_73_WIND_PARSING_TAG = 18;
    private static final int HEIGHT_121_WIND_PARSING_TAG = 13;
    private static final int HEIGHT_217_WIND_PARSING_TAG = 8;
    private static final int HEIGHT_300_WIND_PARSING_TAG = 3;


    // Temperatures values (300,217,121,73,25,8 meters)

    Document doc = Jsoup.connect(URL).get();


    public String get8MetersTemperature() {
        return doc.select(TAG).get(HEIGHT_8_TEMPERATURE_PARSING_TAG).text();
    }

    public String get25MetersTemperature() {
        return doc.select(TAG).get(HEIGHT_25_TEMPERATURE_PARSING_TAG).text();
    }

    public String get73MetersTemperature() {
        return doc.select(TAG).get(HEIGHT_73_TEMPERATURE_PARSING_TAG).text();
    }

    public String get121MetersTemperature() {
        return doc.select(TAG).get(HEIGHT_121_TEMPERATURE_PARSING_TAG).text();
    }

    public String get217MetersTemperature() {
        return doc.select(TAG).get(HEIGHT_217_TEMPERATURE_PARSING_TAG).text();
    }

    public String get300MetersTemperature() {
        return doc.select(TAG).get(HEIGHT_300_TEMPERATURE_PARSING_TAG).text();
    }


    public String get8MetersWind() {
        return doc.select(TAG).get(HEIGHT_8_WIND_PARSING_TAG).text();
    }

    public String get25MetersWind() {
        return doc.select(TAG).get(HEIGHT_25_WIND_PARSING_TAG).text();
    }

    public String get73MetersWind() {
        return doc.select(TAG).get(HEIGHT_73_WIND_PARSING_TAG).text();
    }

    public String get121MetersWind() {
        return doc.select(TAG).get(HEIGHT_121_WIND_PARSING_TAG).text();
    }

    public String get217MetersWind() {
        return doc.select(TAG).get(HEIGHT_217_WIND_PARSING_TAG).text();
    }

    public String get300MetersWind() {
        return doc.select(TAG).get(HEIGHT_300_WIND_PARSING_TAG).text();
    }

}

