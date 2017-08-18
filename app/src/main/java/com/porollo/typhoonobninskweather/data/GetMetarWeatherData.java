package com.porollo.typhoonobninskweather.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


/**
 * Created by Dmitriy S. Porollo on 15.08.2017.
 */

public class GetMetarWeatherData {

    public GetMetarWeatherData() throws IOException{}



    private final String TAG1 = "code";

    private final static String VKO = "https://www.aviationweather.gov/metar/data?ids=UUWW&format=raw&date=0&hours=0&taf=on";
    private final static String SVO = "https://www.aviationweather.gov/metar/data?ids=UUEE&format=raw&date=0&hours=0&taf=on";
    private final static String DME = "https://www.aviationweather.gov/metar/data?ids=UUDD&format=raw&date=0&hours=0&taf=on";
    //private final static String ZIA = "http://ru.allmetsat.com/metar-taf/russia.php?icao=UUBW";
    //private final static String KLF = "http://ru.allmetsat.com/metar-taf/russia.php?icao=UUBC";

    Document doc = Jsoup.connect(VKO).get();
    Document doc1 = Jsoup.connect(SVO).get();
    Document doc2 = Jsoup.connect(DME).get();


    private String vko = doc.select(TAG1).get(0).text();
    private String svo = doc1.select(TAG1).get(0).text();
    private String dme = doc2.select(TAG1).get(0).text();

    public String getDme() {
        return dme;
    }

    public void setDme(String dme) {
        this.dme = dme;
    }

    public static String getVKO() {
        return VKO;
    }

    public static String getSVO() {
        return SVO;
    }

    public String getVko() {
        return vko;
    }

    public void setVko(String vko) {
        this.vko = vko;
    }

    public String getSvo() {
        return svo;
    }

    public void setSvo(String svo) {
        this.svo = svo;
    }
}
