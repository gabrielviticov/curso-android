package com.example.ferramentaslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtTitulo;
    EditText editNomeCompleto;
    Button btnConfirmar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtTitulo = findViewById(R.id.txtTitulo);
        editNomeCompleto = findViewById(R.id.editNomeCompleto);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnConfirmar.setText("Confirmar");
        txtTitulo.setText("Retrato Principal");

        btnConfirmar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                boolean dadosOK = true;
                if(TextUtils.isEmpty(editNomeCompleto.getText().toString())){
                    editNomeCompleto.setError("Por favor, digite seu nome completo");
                    //Toast.makeText(getApplicationContext(), "Por favor, digite seu nome completo e tente novamente!", Toast.LENGTH_SHORT).show();
                    dadosOK = false;
                } else if(dadosOK){
                    Toast.makeText(getApplicationContext(), "Seu nome é: "+editNomeCompleto.getText(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}