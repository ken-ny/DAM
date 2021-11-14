package com.dam.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContadorActivity extends AppCompatActivity {

    int contadorGlobal = 0;
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        Button add1 = findViewById(R.id.add1);
        Button add2 = findViewById(R.id.add2);
        Button add3 = findViewById(R.id.add3);
        Button reset1 = findViewById(R.id.reset1);
        Button reset2 = findViewById(R.id.reset2);
        Button reset3 = findViewById(R.id.reset3);
        Button resetGlobal = findViewById(R.id.resetGlobal);
        TextView contadorGlobal = findViewById(R.id.contadorGlobal);
        TextView contador1 = findViewById(R.id.contador1);
        TextView contador2 = findViewById(R.id.contador2);
        TextView contador3 = findViewById(R.id.contador3);


        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addContador1();
                contador1.setText(getContador1());
                contadorGlobal.setText(getContadorGlobal());
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetContador1();
                contador1.setText(getContador1());
                contadorGlobal.setText(getContadorGlobal());
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addContador2();
                contador2.setText(getContador2());
                contadorGlobal.setText(getContadorGlobal());
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetContador2();
                contador2.setText(getContador2());
                contadorGlobal.setText(getContadorGlobal());
            }
        });

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addContador3();
                contador3.setText(getContador3());
                contadorGlobal.setText(getContadorGlobal());
            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetContador3();
                contador3.setText(getContador3());
                contadorGlobal.setText(getContadorGlobal());
            }
        });

        resetGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetGlobal();
                contador1.setText(getContador1());
                contador2.setText(getContador2());
                contador3.setText(getContador3());
                contadorGlobal.setText(getContadorGlobal());
            }
        });
    }

    public void addContador1(){
        contador1++;
    }

    public void addContador2(){
        contador2++;
    }

    public void addContador3(){
        contador3++;
    }

    public void sumGlobal(){
        contadorGlobal=contador1+contador2+contador3;
    }

    public void resetContador1(){
        contador1=0;
    }
    public void resetContador2(){
        contador2 = 0;
    }
    public void resetContador3(){
        contador3=0;
    }

    public void resetGlobal(){
        contadorGlobal=0;
        resetContador1();
        resetContador2();
        resetContador3();
    }

    public String getContadorGlobal(){
        sumGlobal();
        return String.valueOf(contadorGlobal);
    }

    public String getContador1(){
        return String.valueOf(contador1);
    }

    public String getContador2(){
        return String.valueOf(contador2);
    }

    public String getContador3(){
        return String.valueOf(contador3);
    }
}