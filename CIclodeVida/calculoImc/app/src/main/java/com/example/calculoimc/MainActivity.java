package com.example.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtView;
    Button button;
    EditText edtAltura;
    EditText edtPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPeso = (EditText) findViewById(R.id.txtPeso);
        edtAltura = (EditText) findViewById(R.id.txtAltura);
        txtView = (TextView) findViewById(R.id.lblImc);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double altura = Double.parseDouble(edtAltura.getText().toString());

                Double peso = Double.parseDouble(edtPeso.getText().toString());

                Double imc = calcularImc(altura,peso);

                txtView.setText(imc.toString());

                exibeImcClassificacao(view, imc, getCalssificacao(imc));



            }
        });
    }

    public double calcularImc (double altura, double peso){

        double calcular;

        calcular = peso / Math.pow(altura , 2);

        return calcular;
    }

    public void exibeImcClassificacao (View view, double imc, String classificao){
        txtView = (TextView) findViewById(R.id.lblImc);
        txtView.setText("Seu imc: " + imc + " ! \n Sua Classificão: " + classificao + "!");
    }
        public String getCalssificacao (double imc){
            String classificao;

            if(imc < 16){
                classificao = "Magreza grau III";
            } else if (imc < 17){
                classificao = "Magreza grau II";
            }else if (imc < 18.5){
                classificao = "Magreza grau I";
            }else if (imc < 25){
                classificao = "Saudável";
            }else if (imc < 30){
                classificao = "Pré-Obesidade";
            }else if (imc < 35){
                classificao = "Obesidade moderada II";
            }else if (imc < 40) {
                classificao = "Obesidade severa II";
            } else {
                classificao = "Obesidade muito severa III";
            }

            return classificao;
        }
    }