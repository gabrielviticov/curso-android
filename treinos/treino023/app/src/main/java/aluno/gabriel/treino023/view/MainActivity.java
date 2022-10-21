package aluno.gabriel.treino023.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import aluno.gabriel.treino023.R;
import aluno.gabriel.treino023.controller.AlunoController;

public class MainActivity extends AppCompatActivity {
    AlunoController alunoController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alunoController = new AlunoController(getApplicationContext());
    }
}