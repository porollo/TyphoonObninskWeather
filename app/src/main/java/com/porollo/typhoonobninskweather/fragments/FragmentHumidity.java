package com.porollo.typhoonobninskweather.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.porollo.typhoonobninskweather.R;

/**
 * Created by Dmitriy S. Porollo on 12.10.2017.
 */

public class FragmentHumidity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_humidity, container, false);
    }
}
