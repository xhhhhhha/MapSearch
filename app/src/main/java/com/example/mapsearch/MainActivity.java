package com.example.mapsearch;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {
    private MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            try {
                 SDKInitializer.initialize(getApplicationContext());
                 }catch (Exception e){
                  Log.e("Error",e.getMessage());
 }
            mapView=findViewById(R.id.mapView);
        setContentView(R.layout.activity_main);
    }
}
