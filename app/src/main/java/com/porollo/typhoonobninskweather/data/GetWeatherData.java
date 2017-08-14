package com.porollo.typhoonobninskweather.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by dporo on 10.08.2017.
 */

public class GetWeatherData {

    public GetWeatherData() throws IOException {
    }

    final static String URL = "http://typhoon-tower.obninsk.org/ru/10-minute.asp";
    final String TAG = "td";


    Document doc = Jsoup.connect(URL).get();

    // Temperature values (300,217,121,73,25,8 meters)
    Float td300temp = Float.valueOf(doc.select(TAG).get(5).text());
    Float td217temp = Float.valueOf(doc.select(TAG).get(10).text());
    Float td121temp = Float.valueOf(doc.select(TAG).get(15).text());
    //Float td73temp = Float.valueOf(doc.select(TAG).get(20).text());
    Float td25temp = Float.valueOf(doc.select(TAG).get(25).text());
    Float td8temp = Float.valueOf(doc.select(TAG).get(30).text());

    // Wind values (300,217,121,73,25,8 meters)
    //String td300wind = doc.select(TAG).get(3).text();
    //Float td217wind = Float.valueOf(doc.select(TAG).get(8).text());
    //Float td121wind = Float.valueOf(doc.select(TAG).get(13).text());
    //Float td73wind = Float.valueOf(doc.select(TAG).get(18).text());
    //Float td25wind = Float.valueOf(doc.select(TAG).get(23).text());
    //Float td8wind = Float.valueOf(doc.select(TAG).get(28).text());


    public Float getTd300temp() {
        return td300temp;
    }

    /*    public String getTd300wind() {
            return td300wind;
        }*/

    public void setTd300temp(Float td300temp) {
        this.td300temp = td300temp;
    }
/*    public void setTd300wind(String td300wind) {
        this.td300wind = td300wind;
    }*/


    public Float getTd217temp() {
        return td217temp;
    }
    /*    public Float getTd217wind() {
            return td217wind;
        }*/
    public void setTd217temp(Float td217temp) {
        this.td217temp = td217temp;
    }
/*
    public void setTd217wind(Float td217wind) {
        this.td217wind = td217wind;
    }
*/

    public Float getTd121temp() {
        return td121temp;
    }
    /*
        public Float getTd121wind() {
            return td121wind;
        }
    */
    public void setTd121temp(Float td121temp) {
        this.td121temp = td121temp;
    }
/*
    public void setTd121wind(Float td121wind) {
        this.td121wind = td121wind;
    }
*/

/*    public Float getTd73temp() {
        return td73temp;
    }*/
    //public Float getTd73wind() { return td73wind; }
/*
    public void setTd73temp(Float td73temp) {
        this.td73temp = td73temp;
    }
*/
/*    public void setTd73wind(Float td73wind) {
        this.td73wind = td73wind;
    }*/

    public Float getTd25temp() { return td25temp;}
    /*
        public Float getTd25wind() { return td25wind; }
    */
    public void setTd25temp(Float td25temp) { this.td25temp = td25temp; }
/*
    public void setTd25wind(Float td25wind) {
        this.td25wind = td25wind;
    }
*/

    public Float getTd8temp() { return td8temp; }
    /*
        public Float getTd8wind() {
            return td8wind;
        }
    */
    public void setTd8temp(Float td8temp) {
        this.td8temp = td8temp;
    }
/*
    public void setTd8wind(Float td8wind) {
        this.td8wind = td8wind;
    }
*/
}
