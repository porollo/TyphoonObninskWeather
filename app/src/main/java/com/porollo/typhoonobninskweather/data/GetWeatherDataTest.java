package com.porollo.typhoonobninskweather.data;

import java.io.IOException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


/**
 * Created by Dmitriy S. Porollo on 11.10.2017.
 */

public class GetWeatherDataTest {


    public static void main(String[] args) throws IOException {


        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Subscribed");
            }

            @Override
            public void onNext(Integer value) {
                System.out.println("On Next " + value);
                System.out.println("On Next " + value + 1);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error");
            }

            @Override
            public void onComplete() {
                System.out.println("Complete");
            }
        };

        //observable.subscribe(observer);

    }
}


