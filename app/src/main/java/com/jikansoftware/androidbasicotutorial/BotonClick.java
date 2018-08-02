package com.jikansoftware.androidbasicotutorial;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BotonClick extends AppCompatActivity {
    EditText editTextNum1, editTextNum2, editTextResultado;
    Button btnSumar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton_click);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        editTextResultado = findViewById(R.id.editTextResultado);

        btnSumar = findViewById(R.id.buttonSumar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
            }
        });
    }

    private void sumar() {
        int num1 = 0, num2 = 0, result = 0;

        num1 = Integer.parseInt(editTextNum1.getText().toString());
        num2 = Integer.parseInt(editTextNum2.getText().toString());

        result = num1 + num2;

        editTextResultado.setText(String.valueOf(result));
    }
}
