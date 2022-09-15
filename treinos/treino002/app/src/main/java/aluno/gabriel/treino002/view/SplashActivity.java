package aluno.gabriel.treino002.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import aluno.gabriel.treino002.BuildConfig;
import aluno.gabriel.treino002.R;
import aluno.gabriel.treino002.model.Usuario;

public class SplashActivity extends AppCompatActivity {
    TextView txtVersion;
    String app;
    Usuario u1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        applicationVersionLayout();
        trocarTela();
    }

    protected void trocarTela() {
        boolean Handler = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                transferirUsuario();
            }
        },5000);
    }

    protected void applicationVersionLayout(){
        txtVersion = findViewById(R.id.txtVersion);
        app = BuildConfig.VERSION_NAME;
        txtVersion.setText(app);
    }

    protected void transferirUsuario(){
        u1 = new Usuario(
                "Diego Tevez Holambra",
                "unodiegitto.holambra@hotmail.com",
                "774me$$3!AWE890"
        );
        Bundle bundle = new Bundle();
        bundle.putString("nome", u1.getNome());
        bundle.putString("email", u1.getEmail());
        bundle.putString("senha", u1.getSenha());

        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }



}