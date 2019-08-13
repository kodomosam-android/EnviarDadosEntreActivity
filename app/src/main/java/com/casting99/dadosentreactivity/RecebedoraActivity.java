package com.casting99.dadosentreactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecebedoraActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebedora);

        textView1 = (TextView)findViewById(R.id.texto1);
        textView2 = (TextView)findViewById(R.id.texto2);

        Intent intentRecebedora = getIntent();

        Bundle parametros = intentRecebedora.getExtras();

        if(parametros != null){

            String nome = parametros.getString("chave_nome");

            int idade = parametros.getInt("chave_idade");

            textView1.setText("Nome recebido: " + nome);
            textView1.setTextSize(24);
            textView2.setText("Idade recebida: " + idade);
            textView2.setTextSize(24);

        }
    }
}
