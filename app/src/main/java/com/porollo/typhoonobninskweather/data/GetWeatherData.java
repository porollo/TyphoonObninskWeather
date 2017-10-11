package com.porollo.typhoonobninskweather.data;

import android.util.ArrayMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dmitriy S. Porollo on 14.08.2017.
 */

public class GetWeatherData {

    public GetWeatherData() throws IOException {
    }

    private final static String URL = "http://typhoon-tower.obninsk.org/ru/10-minute.asp";
    private final String TAG = "td";

    Document doc = Jsoup.connect(URL).get();

    // Temperature values (300,217,121,73,25,8 meters)

    public void getTempMap() {

        HashMap<Integer, String> temperaturesMap = new HashMap<>();

        temperaturesMap.put(300, doc.select(TAG).get(5).text());
        temperaturesMap.put(217, doc.select(TAG).get(10).text());
        temperaturesMap.put(121, doc.select(TAG).get(15).text());
        temperaturesMap.put(73, doc.select(TAG).get(20).text());
        temperaturesMap.put(25, doc.select(TAG).get(25).text());
        temperaturesMap.put(8, doc.select(TAG).get(30).text());
    }

    public void getWindMap() {

        HashMap<Integer, String> windMap = new HashMap<>();

        windMap.put(300, doc.select(TAG).get(3).text());
        windMap.put(217, doc.select(TAG).get(8).text());
        windMap.put(121, doc.select(TAG).get(13).text());
        windMap.put(73, doc.select(TAG).get(18).text());
        windMap.put(25, doc.select(TAG).get(23).text());
        windMap.put(8, doc.select(TAG).get(28).text());
    }
}
