package com.example.conversionunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class temperatura extends AppCompatActivity {
    private Spinner spinner1,spinner2;
    private EditText Valor1;
    private TextView resultado;
    private String resCalculo;
    private double calculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
        spinner1=(Spinner) findViewById(R.id.sp_unidadTemp);
        spinner2=(Spinner) findViewById(R.id.sp_unidadTemp2);
        Valor1=(EditText) findViewById(R.id.txt_valorTemp);
        resultado=(TextView) findViewById(R.id.tv_resultadoTemp);
    }
    public void irMain (View view){

        Intent cambio= new Intent(temperatura.this,MainActivity.class);
        startActivity(cambio);

    }

    public void conversionTemp(View view){
        double valortemp=Float.parseFloat(Valor1.getText().toString());
        int posiciontemp=spinner1.getSelectedItemPosition();
        switch (posiciontemp){

            case 0:
                int posiciontem2=spinner2.getSelectedItemPosition();
                switch (posiciontem2){
                    case 0:
                        calculo= valortemp*1;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Fahrenheit"));
                        break;
                    case 1:
                        calculo= (valortemp-32) * 5/9 ;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Celsius"));
                        break;
                    case 2:
                        calculo= (valortemp-32) * 5/9 + 273.15 ;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kelvin"));
                        break;
                }
                break;
            case 1:
                posiciontem2=spinner2.getSelectedItemPosition();
                switch (posiciontem2){
                    case 0:
                        calculo= (valortemp * 9/5) + 32;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Fahrenheit"));
                        break;
                    case 1:
                        calculo= valortemp ;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Celsius"));
                        break;
                    case 2:
                        calculo= valortemp + 273.15 ;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kelvin"));
                        break;
                }
                break;
            case 2:
                posiciontem2=spinner2.getSelectedItemPosition();
                switch (posiciontem2){
                    case 0:
                        calculo= (valortemp - 273.15) * 9/5 + 32 ;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Fahrenheit"));
                        break;
                    case 1:
                        calculo= valortemp - 273.15 ;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Celsius"));
                        break;
                    case 2:
                        calculo= valortemp;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Kelvin"));
                        break;
                }
                break;

        }
    }
}