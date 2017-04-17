package com.zxl.dynamicweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zxl.dynamicweather.view.DynamicWeatherView;
import com.zxl.dynamicweather.view.RainTypeImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        DynamicWeatherView mDynamicWeatherView = (DynamicWeatherView) findViewById(R.id.dynamic_weather_view);
        mDynamicWeatherView.setType(new RainTypeImpl(this, mDynamicWeatherView));
    }
}
