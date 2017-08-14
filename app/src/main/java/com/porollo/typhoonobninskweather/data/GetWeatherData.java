package com.porollo.typhoonobninskweather.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

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
    private String temp300 = doc.select(TAG).get(5).text();
    private String temp217 = doc.select(TAG).get(10).text();
    private String temp121 = doc.select(TAG).get(15).text();
    private String temp73 = doc.select(TAG).get(20).text();
    private String temp25 = doc.select(TAG).get(25).text();
    private String temp8 = doc.select(TAG).get(30).text();

    // Wind values (300,217,121,73,25,8 meters)
    private String wind300 = doc.select(TAG).get(3).text();
    private String wind217 = doc.select(TAG).get(8).text();
    private String wind121 = doc.select(TAG).get(13).text();
    private String wind73 = doc.select(TAG).get(18).text();
    private String wind25 = doc.select(TAG).get(23).text();
    private String wind8 = doc.select(TAG).get(28).text();


    // Temperature getters
    public String getTemp300() {
        return temp300;
    }
    public String getTemp217() {
        return temp217;
    }
    public String getTemp121() {
        return temp121;
    }
    public String getTemp73() { return temp73; }
    public String getTemp25() { return temp25;}
    public String getTemp8() { return temp8; }

    // ...and setters
    public void setTemp300(String temp300) {
        this.temp300 = temp300;
    }
    public void setTemp217(String temp217) {
        this.temp217 = temp217;
    }
    public void setTemp121(String temp121) {
        this.temp121 = temp121;
    }
    public void set73temp (String temp73) { this.temp73 = temp73; }
    public void setTemp25 (String temp25) { this.temp25 = temp25; }
    public void setTemp8  (String temp8) {
        this.temp8 = temp8;
    }

    // Wind getters
    public String getWind300() { return wind300; }
    public String getWind217() { return wind217; }
    public String getWind121() { return wind121; }
    public String getWind73() { return wind73; }
    public String getWind25() { return wind25; }
    public String getWind8() { return wind8; }

    // ...and setters
    public void setWind300(String wind300) { this.wind300 = wind300; }
    public void setWind217(String wind217) { this.wind217 = wind217; }
    public void setWind121(String wind121) { this.wind121 = wind121; }
    public void setWind73(String wind73) { this.wind73 = wind73; }
    public void setWind25(String wind25) { this.wind25 = wind25; }
    public void setWind8(String wind8) { this.wind8 = wind8; }
}
