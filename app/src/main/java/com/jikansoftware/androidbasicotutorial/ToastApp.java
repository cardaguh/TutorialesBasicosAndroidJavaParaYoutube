package com.jikansoftware.androidbasicotutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastApp extends AppCompatActivity {

    Button btnLong, btnShort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Toast.makeText(this, "Toast del onCreate", Toast.LENGTH_LONG).show();

        btnLong = findViewById(R.id.buttonLong);
        btnShort = findViewById(R.id.buttonShort);

        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarToast("Toast mensaje LONG");
            }
        });

        btnShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarToast("Toast mensaje short");
            }
        });
    }

    private void mostrarToast(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
