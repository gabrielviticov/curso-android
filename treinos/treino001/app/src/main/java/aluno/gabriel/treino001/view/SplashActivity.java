package aluno.gabriel.treino001.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import aluno.gabriel.treino001.R;
import aluno.gabriel.treino001.model.Usuario;

public class SplashActivity extends AppCompatActivity {
    Usuario u1;
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
                u1 = new Usuario(
                        "Gabriel Viticov Plata de Souza",
                        "gabrielviticvo@gmail.com",
                        "3358btQ!;;786"
                );

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", u1.getNome());
                bundle.putString("email", u1.getEmail());
                bundle.putString("password", u1.getSenha());
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}