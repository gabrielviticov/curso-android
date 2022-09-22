package com.example.ferramentaslayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView txtTitulo;
    EditText editNomeCompleto;
    Button btnConfirmar;
    ToggleButton tbLigado;
    SwitchCompat swMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtTitulo = findViewById(R.id.txtTitulo);
        editNomeCompleto = findViewById(R.id.editNomeCompleto);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnConfirmar.setText("Confirmar");
        txtTitulo.setText("Retrato Principal");
        tbLigado = findViewById(R.id.tbLigado);
        swMostrar = findViewById(R.id.swMostrar);

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

        tbLigado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tbLigado.isChecked()){
                    editNomeCompleto.setEnabled(false);
                } else {
                    editNomeCompleto.setEnabled(true);
                }
            }
        });

        swMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(swMostrar.isChecked()){
                    txtTitulo.setVisibility(View.GONE);
                } else {
                    txtTitulo.setVisibility(View.VISIBLE);
                    String titulo = txtTitulo.getText().toString().toLowerCase();
                    txtTitulo.setText(titulo);
                }
            }
        });
    }
}