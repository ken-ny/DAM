package com.dam.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton cronoImage = (ImageButton) findViewById(R.id.cronometroButton);
        ImageButton contadorImage = (ImageButton) findViewById(R.id.contadorButton);

        cronoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cronoActivity = new Intent(MainActivity.this, CronometroActivity.class);

                startActivity(cronoActivity);
            }
        });

        contadorImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contadorActivity = new Intent(MainActivity.this, ContadorActivity.class);

                startActivity(contadorActivity);
            }
        });


    }
}