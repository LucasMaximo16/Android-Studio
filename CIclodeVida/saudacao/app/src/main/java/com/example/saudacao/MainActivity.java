package com.example.saudacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSaudacao;
    EditText edtNome;
    Button btnSaudacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.txtNome);
        tvSaudacao = (TextView) findViewById(R.id.lblSaudacao);
        btnSaudacao = (Button)findViewById(R.id.cmdSaudacao);
        btnSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSaudacao.setText(("Olá" + edtNome.getText() + " Seja bem vindo ao curso de PDM"));
            }
        });
    }
}