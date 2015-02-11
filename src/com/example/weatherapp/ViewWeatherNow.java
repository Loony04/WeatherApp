package com.example.weatherapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

public class ViewWeatherNow extends Fragment {
    public static final String ARG_OBJECT = "object";

    
    @Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(
                R.layout.activity_view_now, container, false);
        return rootView;
        
    }
}