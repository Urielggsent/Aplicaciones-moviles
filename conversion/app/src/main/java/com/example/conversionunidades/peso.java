package com.example.conversionunidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class peso extends AppCompatActivity {
    private Spinner spinner1,spinner2;
    private EditText Valor1;
    private TextView resultado;
    String resCalculo;
    double calculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);
        //Relación logica-grafica
        spinner1=(Spinner) findViewById(R.id.sp_unidad1);
        spinner2=(Spinner) findViewById(R.id.sp_unidad2);
        Valor1=(EditText) findViewById(R.id.txtvalor1);
        resultado=(TextView) findViewById(R.id.tv_resultado);



    }
    private void irMain (View view){

        Intent cambio= new Intent(peso.this,MainActivity.class);
        startActivity(cambio);

    }
    public void Conversion(View view) {
            double valor=Float.parseFloat(Valor1.getText().toString());
            //String seleccion=spinner1.getSelectedItem().toString();
            int posicion=spinner1.getSelectedItemPosition();
            switch (posicion){
                //HECTOGRAMOS
                case 0:
                    int posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){
                        case 2:
                            calculo= valor*100;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;
                        case 5:
                            calculo= valor*100000;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 0.1;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*3.5274;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*0.220462;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }
                    break;
                //DECAGRAMOS
                case 1:
                    posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){
                        case 2:
                            calculo= valor*10;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;
                        case 5:
                            calculo= valor*10000;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 0.01;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*0.35274;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*0.0220462;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }

                    break;
                //GRAMOS
                case 2:
                    posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){
                        case 2:
                            calculo= valor*1;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;
                        case 5:
                            calculo= valor*1000;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 0.001;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*0.035274;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*0.00220462;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }

                    break;
                //Decigramos
                case 3:
                    posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){

                        case 2:
                            calculo= valor*0.1;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;

                        case 5:
                            calculo= valor*100;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 0.0001;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*0.0035274;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*0.000220462;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }

                    break;
                //Centigramos
                case 4:
                    posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){

                        case 2:
                            calculo= valor*0.01;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;

                        case 5:
                            calculo= valor*10;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 1e-5;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*0.00035274;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*(2.20462e-5);
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }

                    break;
                //Miligramos
                case 5:
                    posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){

                        case 2:
                            calculo= valor*0.001;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;
                        case 5:
                            calculo= valor*1;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 1e-6;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*3.5274e-5;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*(2.20462e-6);
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }

                    break;
                //Kilogramos
                case 6:
                    posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){


                        case 2:
                            calculo= valor*1000;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;

                        case 5:
                            calculo= valor*1000000;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 1;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*35.274;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*2.20462;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }

                    break;
                //Onzas
                case 7:
                    posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){

                        case 2:
                            calculo= valor*28.3495;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;

                        case 5:
                            calculo= valor*28349.5;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 0.0283495;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*1;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*0.0625;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }

                    break;
                //Libras
                case 8:
                    posicion2=spinner2.getSelectedItemPosition();
                    switch (posicion2){

                        case 2:
                            calculo= valor*453.592;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Gramos"));
                            break;

                        case 5:
                            calculo= valor*453592;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Miligramos"));
                            break;
                        case 6:
                            calculo= valor * 0.453592;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Kilogramos"));
                            break;
                        case 7:
                            calculo= valor*16;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Onzas"));
                            break;
                        case 8:
                            calculo= valor*1;
                            resCalculo=String.valueOf(calculo);
                            resultado.setText((resCalculo+" Libras"));
                            break;
                    }

                    break;


            }


    }
}