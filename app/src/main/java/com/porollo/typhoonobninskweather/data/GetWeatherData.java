package com.porollo.typhoonobninskweather.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Dmitriy S. Porollo on 14.08.2017.
 */

public class GetWeatherData {

    public GetWeatherData(Document doc) throws IOException {
        this.doc = doc;
    }

    private final static String URL = "http://typhoon-tower.obninsk.org/ru/10-minute.asp";
    private final String TAG = "td";

    private static final int HEIGHT300 = 300;
    private static final int HEIGHT217 = 217;
    private static final int HEIGHT121 = 121;
    private static final int HEIGHT73 = 73;
    private static final int HEIGHT25 = 25;
    private static final int HEIGHT8 = 8;

    Document doc = Jsoup.connect(URL).get();

    // Temperatures values (300,217,121,73,25,8 meters)

    public Map<Integer, Float> getTempMap() {

        HashMap<Integer, Float> temperaturesMap = new HashMap<>();

        temperaturesMap.put(HEIGHT300, Float.parseFloat(doc.select(TAG).get(5).text()));
        temperaturesMap.put(HEIGHT217, Float.parseFloat(doc.select(TAG).get(10).text()));
        temperaturesMap.put(HEIGHT121, Float.parseFloat(doc.select(TAG).get(15).text()));
        temperaturesMap.put(HEIGHT73, Float.parseFloat(doc.select(TAG).get(20).text()));
        temperaturesMap.put(HEIGHT25, Float.parseFloat(doc.select(TAG).get(25).text()));
        temperaturesMap.put(HEIGHT8, Float.parseFloat(doc.select(TAG).get(30).text()));

        return temperaturesMap;
    }

    public Map<Integer, String> getWindMap() {

        HashMap<Integer, String> windMap = new HashMap<>();

        windMap.put(HEIGHT300, doc.select(TAG).get(3).text());
        windMap.put(HEIGHT217, doc.select(TAG).get(8).text());
        windMap.put(HEIGHT121, doc.select(TAG).get(13).text());
        windMap.put(HEIGHT73, doc.select(TAG).get(18).text());
        windMap.put(HEIGHT25, doc.select(TAG).get(23).text());
        windMap.put(HEIGHT8, doc.select(TAG).get(28).text());

        return windMap;
    }
}