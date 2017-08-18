package com.porollo.typhoonobninskweather.data;


import io.reactivex.Flowable;

/**
 * Created by Dmitriy S. Porollo on 18.08.2017.
 */

public class RxTest {

    public static void main(String[] args) {




        Flowable.just("Hello world").subscribe(System.out::println);

    }
}
