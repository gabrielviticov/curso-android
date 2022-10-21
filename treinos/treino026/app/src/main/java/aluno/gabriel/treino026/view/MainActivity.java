package aluno.gabriel.treino026.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import aluno.gabriel.treino026.R;
import aluno.gabriel.treino026.controller.UsuariosController;

public class MainActivity extends AppCompatActivity {
    UsuariosController usuariosController;
    Button btnCadastrarUsuario;
    Button btnFecharApp;
    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        includeElementsById();
        programmingEventsByElements();

        usuariosController = new UsuariosController(getApplicationContext());
    }

    protected void includeElementsById(){
        btnCadastrarUsuario = findViewById(R.id.btnCadastrarUsuario);
        btnFecharApp = findViewById(R.id.btnFecharApp);
    }

    protected void programmingEventsByElements(){
        btnCadastrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdicionarUsuarioActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnFecharApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Fechar o aplicativo");
                alertDialog.setMessage("Você deseja fechar o aplicativo?");
                alertDialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alertDialog.setNegativeButton("Não", null).show();
            }
        });
    }
}