package aluno.gabriel.treino018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCadastro, btnListagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastro = findViewById(R.id.btnCadastro);
        btnListagem = findViewById(R.id.btnListagem);

        Intent intentC = new Intent(this, CadastroActivity.class);
        Intent intentL = new Intent(this, ListagemActivity.class);
        btnCadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(intentC);
            }
        });

        btnListagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intentL);
            }
        });
    }
}