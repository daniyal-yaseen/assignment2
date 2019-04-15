package com.example.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView date;
TextView weatherName;
TextView humidity;
TextView pressure;
TextView wind;
TextView hTemp;
TextView lTemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        String dateMessage=intent.getStringExtra("dateMessage");
        date=findViewById(R.id.date);
        date.setText(dateMessage);

        String weatherMessage = intent.getStringExtra("weatherMessage");
        weatherName=findViewById(R.id.weatherType);
        weatherName.setText(weatherMessage);

        String humidityMessage = intent.getStringExtra("humidityMessage");
        humidity=findViewById(R.id.hum);
        humidity.setText(humidityMessage);

        String pressureMessage = intent.getStringExtra("pressureMessage");
        pressure=findViewById(R.id.pres);
        pressure.setText(pressureMessage);

        String windMessage = intent.getStringExtra("windMessage");
        wind=findViewById(R.id.w);
        wind.setText(windMessage);

        String highTemp = intent.getStringExtra("highTemp");
        hTemp=findViewById(R.id.hTemp);
        hTemp.setText(highTemp);

        String lowTemp = intent.getStringExtra("lowTemp");
        lTemp=findViewById(R.id.lTemp);
        lTemp.setText(lowTemp);


    }
}
