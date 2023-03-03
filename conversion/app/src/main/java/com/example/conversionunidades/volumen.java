package com.example.conversionunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class volumen extends AppCompatActivity {
    private Spinner spinner1_vol, spinner2_vol;
    private EditText Valor1;
    private TextView resultado;
    private String resCalculo;
    private double calculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumen);
        spinner1_vol=(Spinner) findViewById(R.id.spinner);
        spinner2_vol=(Spinner) findViewById(R.id.spinner2);
        Valor1=(EditText) findViewById(R.id.txtValorVol);
        resultado=(TextView) findViewById(R.id.txtResultadoVol);
    }
    public void irMain (View view){

        Intent cambio= new Intent(volumen.this,MainActivity.class);
        startActivity(cambio);

    }
    public void Conversionvol(View view){
        double valor=Float.parseFloat(Valor1.getText().toString());
        int posicion=spinner1_vol.getSelectedItemPosition();
        switch (posicion){
            case 0:
                int posicion2=spinner2_vol.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        resCalculo=String.valueOf(valor);
                        resultado.setText(resCalculo+" Litros");
                        break;
                    case 1:
                        calculo= valor*1000;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Mililitros"));
                        break;
                }
                break;
            case 1:
                posicion2=spinner2_vol.getSelectedItemPosition();
                switch (posicion2){
                    case 0:
                        calculo= valor*0.001;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Litros"));
                        break;
                    case 1:
                        calculo= valor*1;
                        resCalculo=String.valueOf(calculo);
                        resultado.setText((resCalculo+" Mililitros"));
                        break;
                }
                break;
        }

    }
}