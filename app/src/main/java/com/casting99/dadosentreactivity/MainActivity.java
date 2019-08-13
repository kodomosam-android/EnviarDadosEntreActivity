package com.casting99.dadosentreactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button enviarDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviarDados = (Button) findViewById(R.id.idbutton);

        enviarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = "Rodrigo";
                int idade = 29;

                Intent intenEnviadora = new Intent(getApplicationContext(),RecebedoraActivity.class);

                Bundle parametros = new Bundle();

                parametros.putString("chave_nome",nome);
                parametros.putInt("chave_idade",idade);

                intenEnviadora.putExtras(parametros);

                startActivity(intenEnviadora);

            }
        });

    }
}
