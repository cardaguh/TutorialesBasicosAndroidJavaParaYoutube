package com.jikansoftware.androidbasicotutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCicloDeVida, buttonClick, btnEnvioDatos, btnCamara, btnMusic, btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCicloDeVida = findViewById(R.id.buttonCicloVida);
        buttonClick = findViewById(R.id.buttonClick);
        btnEnvioDatos = findViewById(R.id.buttonEnvioDatos);
        btnCamara = findViewById(R.id.buttonCamara);
        btnMusic = findViewById(R.id.buttonMusic);
        btnToast = findViewById(R.id.buttonToast);

        btnCicloDeVida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Defino Intent para ir a la otra actividad
                Intent i = new Intent(getApplicationContext(), CicloVida.class);
                startActivity(i);
            }
        });

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), BotonClick.class);
                startActivity(i);
            }
        });

        btnEnvioDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String miDato = "Yo soy un programador Android";

                Intent intent = new Intent(getApplicationContext(), EnvioDatos.class);
                intent.putExtra("MI_DATO", miDato);
                startActivity(intent);
            }
        });

        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Camara.class);
                startActivity(intent);
            }
        });

        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MediaPlayerApp.class);
                startActivity(intent);
            }
        });

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ToastApp.class);
                startActivity(intent);
            }
        });
    }
}
