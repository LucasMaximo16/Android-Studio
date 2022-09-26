package com.example.faixaetaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button cmdButton;
    EditText edtIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        cmdButton = (Button) findViewById(R.id.cmdButton);
        edtIdade = (EditText) findViewById(R.id.txtidade);
        textView = (TextView) findViewById(R.id.lblMostraIdade);

        cmdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               idade(v);
            }

        });
    }

    public void idade(View v){

        int idade = Integer.parseInt(edtIdade.getText().toString());

        if ((idade>=0) && (idade <=12)) {
            textView.setText("Voce é um adolecente Criança");
        }else if((idade>12) && (idade<=17)){
            textView.setText("Você é adolecente");
        }else {
            textView.setText(("Você é um adulto"));
        }
    }
}