package com.example.rx16.trabajopracticon2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int valor = 0;
    public TextView textValor;
    private Button buttonSumar;
    private Button buttonRestar;
    private Button buttonOcultar;
    private Button buttonReset;
    private Button buttonZoomMas;
    private Button buttonZoomMenos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        identificar();
        metodosDeBotones();

    }

    public void identificar(){
        textValor = findViewById(R.id.textValor);
        buttonOcultar = findViewById(R.id.buttonOcultar);
        buttonReset = findViewById(R.id.buttonReset);
        buttonRestar = findViewById(R.id.buttonRestar);
        buttonSumar = findViewById(R.id.buttonSumar);
        buttonZoomMas = findViewById(R.id.buttonZoomMas);
        buttonZoomMenos = findViewById(R.id.buttonZoomMenos);
    }

    public void metodosDeBotones(){
        buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumar();
            }
        });
        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restar();
            }
        });
        buttonZoomMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomMenos();
            }
        });
        buttonZoomMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomMas();
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        buttonOcultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocultar();
            }
        });

    }

    public void sumar(){
        valor++;
        textValor.setText(String.valueOf(valor));
    }

    public void restar(){
        if(valor > 0){
            valor--;
            textValor.setText(String.valueOf(valor));
        }
    }

    public void zoomMas(){
        textValor.setTextSize(30.0f);
    }

    public void zoomMenos(){
        textValor.setTextSize(14.0f);
    }

    public void ocultar(){
        textValor.setVisibility(View.INVISIBLE);
    }

    public void reset(){
        valor=0;
        textValor.setText("0");
        textValor.setTextSize(22.0f);
        textValor.setVisibility(View.VISIBLE);
    }
}
