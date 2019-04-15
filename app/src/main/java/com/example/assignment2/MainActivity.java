package com.example.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.activitybtn);
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,Main2Activity.class);
               String date="Today, August 7";
               intent.putExtra("dateMessage",date);

               String weatherName = "Rain";
               intent.putExtra("weatherMessage",weatherName);

               String humidity="60%";
               intent.putExtra("humidityMessage",humidity);

               String pressure="889 hPa";
               intent.putExtra("pressureMessage",pressure);

               String wind = "41 km/h SE";
               intent.putExtra("windMessage",wind);

               String highTemp="32°";
               intent.putExtra("highTemp",highTemp);

               String lowTemp="15°";
               intent.putExtra("lowTemp",lowTemp);

               startActivity(intent);
           }
       });
    }
}
