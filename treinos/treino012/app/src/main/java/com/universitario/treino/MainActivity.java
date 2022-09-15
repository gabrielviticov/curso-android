package com.universitario.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editUsuario, editSenha;
    Button btnConectar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsuario = findViewById(R.id.editUsuario);
        editSenha = findViewById(R.id.editSenha);
        btnConectar = findViewById(R.id.btnConectar);

        btnConectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Boolean dadosOK = true;
                if(TextUtils.isEmpty(editUsuario.getText().toString()) && TextUtils.isEmpty(editSenha.getText().toString())){
                    editUsuario.setError("*");
                    editSenha.setError("*");
                    Toast.makeText(MainActivity.this, "Por favor, Informe seu UserName e sua Senha!", Toast.LENGTH_LONG).show();
                }
                else if(TextUtils.isEmpty(editUsuario.getText().toString())){
                    editUsuario.setError("*");
                    Toast.makeText(MainActivity.this, "Por favor, informar seu UserName!", Toast.LENGTH_LONG).show();
                } else if(TextUtils.isEmpty(editSenha.getText().toString())){
                    editSenha.setError("*");
                    Toast.makeText(MainActivity.this, "Por favor, informar sua senha!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Seu login é: "+editUsuario.getText()+" e sua senha é: "+editSenha.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}