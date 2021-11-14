package com.dam.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.LinearLayout;

public class CronometroActivity extends AppCompatActivity {
    Boolean stopped = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronometro);


        Button start = findViewById(R.id.startButton);
        Button stop = findViewById(R.id.stopButton);
        Button reset = findViewById(R.id.resetButton);

        Chronometer chrono = new Chronometer(this);
        LinearLayout linearLayout = findViewById(R.id.timer);
        if (linearLayout != null) {
            linearLayout.addView(chrono);
        }


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrono.start();
                stop.setText(R.string.stop);
            }
        });


        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(stopped){
                   chrono.start();
                   stopped = false;
                }else{
                    chrono.stop();
                    stopped = true;
                }

                stop.setText(stopped ? R.string.resume : R.string.stop);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrono.setBase(SystemClock.elapsedRealtime());
                stop.setText(R.string.stop);
            }
        });



    }
}