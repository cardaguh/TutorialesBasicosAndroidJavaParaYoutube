package com.jikansoftware.androidbasicotutorial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class CicloVida extends AppCompatActivity {
    String TAG = "mensaje";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ciclo_de_vida);

        Log.d(TAG, "Estamos en OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Estamos en OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Estamos en OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Estamos en OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Estamos en OnDestroy");
    }
}
