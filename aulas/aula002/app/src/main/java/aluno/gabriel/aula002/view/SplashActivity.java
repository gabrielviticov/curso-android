package aluno.gabriel.aula002.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import aluno.gabriel.aula002.R;
import aluno.gabriel.aula002.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        trocarTela();
    }

    protected void trocarTela(){
        boolean Handler = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                cliente = new Cliente(
                        "Hugo Tevéz Holambra Diniz",
                        "Masculino",
                        35,
                        "huguitotevez28@hotmail.com",
                        "+54 159324-6808"
                );
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", cliente.getNome());
                bundle.putString("sexo", cliente.getSexo());
                bundle.putInt("idade", cliente.getIdade());
                bundle.putString("email", cliente.getEmail());
                bundle.putString("telefone", cliente.getTelefone());
                intent.putExtras(bundle);
                startActivity(intent);
                finish();

            }
        },5000);
    }
}