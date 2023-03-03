package com.example.conversionunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class longitud extends AppCompatActivity {
    private Spinner spinner1,spinner2;
    private EditText Valor1;
    private TextView resultado;
    private String resCalculo;
    private double calculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);
        spinner1=(Spinner) findViewById(R.id.sp_unidadlong1);
        spinner2=(Spinner) findViewById(R.id.sp_unidadlong2);
        Valor1=(EditText) findViewById(R.id.txt_valorLong);
        resultado=(TextView) findViewById(R.id.tv_resultadolong);
    }
    public void irMain (View view){

        Intent cambio= new Intent(longitud.this,MainActivity.class);
        startActivity(cambio);

    }

    public void conversionLongitud(View view){
        double valor=Float.parseFloat(Valor1.getText().toString());
        int posicion=spinner1.getSelectedItemPosition();
        switch (posicion){
            case 0:
                int posicion2=spinner2.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        calculo= valor;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Metros"));
                        break;
                    case 2:
                        calculo= valor*100;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Centimetros"));
                        break;
                    case 3:
                        calculo= valor*1000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Milimetros"));
                        break;
                    case 6:
                        calculo= valor*0.001;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kilómetros"));
                        break;
                }
                break;
            case 1:
                posicion2=spinner2.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        calculo= valor;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Metros"));
                        break;
                    case 2:
                        calculo= valor*100;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Centimetros"));
                        break;
                    case 3:
                        calculo= valor*1000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Milimetros"));
                        break;
                    case 6:
                        calculo= valor*0.001;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kilómetros"));
                        break;
                }
                break;
            case 2:
                posicion2=spinner2.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        calculo= valor*0.01;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Metros"));
                        break;
                    case 2:
                        calculo= valor;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Centimetros"));
                        break;
                    case 3:
                        calculo= valor*10;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Milimetros"));
                        break;
                    case 6:
                        calculo= valor*1e-5;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kilómetros"));
                        break;
                }
                break;
            case 3:
                posicion2=spinner2.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        calculo= valor*0.001;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Metros"));
                        break;
                    case 2:
                        calculo= valor*0.1;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Centimetros"));
                        break;
                    case 3:
                        calculo= valor;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Milimetros"));
                        break;
                    case 6:
                        calculo= valor*1e-6;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kilómetros"));
                        break;
                }
                break;
            case 4:
                posicion2=spinner2.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        calculo= valor*10;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Metros"));
                        break;
                    case 2:
                        calculo= valor*1000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Centimetros"));
                        break;
                    case 3:
                        calculo= valor*10000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Milimetros"));
                        break;
                    case 6:
                        calculo= valor*0.01;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kilómetros"));
                        break;
                }
                break;
            case 5:
                posicion2=spinner2.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        calculo= valor*100;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Metros"));
                        break;
                    case 2:
                        calculo= valor*10000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Centimetros"));
                        break;
                    case 3:
                        calculo= valor*100000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Milimetros"));
                        break;
                    case 6:
                        calculo= valor*0.1;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kilómetros"));
                        break;
                }
                break;
            case 6:
                posicion2=spinner2.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        calculo= valor*1000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Metros"));
                        break;
                    case 2:
                        calculo= valor*100000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Centimetros"));
                        break;
                    case 3:
                        calculo= valor*1000000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Milimetros"));
                        break;
                    case 6:
                        calculo= valor;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kilómetros"));
                        break;
                }
                break;
        }

    }
}