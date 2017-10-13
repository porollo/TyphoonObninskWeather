package com.porollo.typhoonobninskweather;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.porollo.typhoonobninskweather.fragments.FragmentHumidity;
import com.porollo.typhoonobninskweather.fragments.FragmentTemperaure;
import com.porollo.typhoonobninskweather.fragments.FragmentWind;

/**
 * Created by Dmitriy S. Porollo on 13.10.2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FragmentTemperaure fragmentTemperaure = new FragmentTemperaure();
                return fragmentTemperaure;
            case 1:
                FragmentHumidity fragmentHumidity = new FragmentHumidity();
                return fragmentHumidity;
            case 2:
                FragmentWind fragmentWind = new FragmentWind();
                return fragmentWind;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}