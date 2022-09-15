package aluno.gabriel.treino010.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import aluno.gabriel.treino010.R;
import aluno.gabriel.treino010.controller.UsuarioController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsuarioController usuarioController = new UsuarioController(getApplicationContext());
    }
}