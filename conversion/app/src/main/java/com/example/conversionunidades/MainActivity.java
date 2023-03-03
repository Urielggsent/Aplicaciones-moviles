package com.example.conversionunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irPeso (View view){

        Intent cambio= new Intent(MainActivity.this,peso.class);
        startActivity(cambio);

    }
    public void irLong (View view){

        Intent cambio= new Intent(MainActivity.this,longitud.class);
        startActivity(cambio);

    }
    public void irTemp (View view){

        Intent cambio= new Intent(MainActivity.this,temperatura.class);
        startActivity(cambio);

    }
    public void irVolu (View view){

        Intent cambio= new Intent(MainActivity.this,volumen.class);
        startActivity(cambio);

    }


}