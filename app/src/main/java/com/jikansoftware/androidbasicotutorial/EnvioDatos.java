package com.jikansoftware.androidbasicotutorial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class EnvioDatos extends AppCompatActivity {
    TextView tvDato;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.envio_datos);

        tvDato = findViewById(R.id.textViewDatos);

        String datoRecibido = getIntent().getStringExtra("MI_DATO");
        tvDato.setText(datoRecibido);
    }
}
