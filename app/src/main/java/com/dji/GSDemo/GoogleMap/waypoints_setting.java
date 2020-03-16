package com.dji.GSDemo.GoogleMap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class waypoints_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waypoints_setting);

//        Spinner spinner = (Spinner)findViewById(R.id.spinner);
//        final String[] lunch = {"選擇路線", "路線一", "路線二", "路線三", "路線四"};
//        ArrayAdapter<String> lunchList = new ArrayAdapter<>(waypoints_setting.this,
//                android.R.layout.simple_spinner_dropdown_item,
//                lunch);spinner.setAdapter(lunchList);
    }
}
