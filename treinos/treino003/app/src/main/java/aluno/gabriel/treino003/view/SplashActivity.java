package aluno.gabriel.treino003.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import aluno.gabriel.treino003.R;
import aluno.gabriel.treino003.core.ApplicationUtil;
import aluno.gabriel.treino003.model.Usuario;

public class SplashActivity extends AppCompatActivity {
    Usuario u1;
    Bundle bundle;
    TextView txtVersion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        applicationVersion();
        trocarTela();
    }

    protected void trocarTela(){
        boolean Handler = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                userDataSource();
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        },5000);
    }

    protected void applicationVersion(){
        txtVersion = findViewById(R.id.txtVersion);
        txtVersion.setText("Versão: "+ ApplicationUtil.APP_VERSION);
    }

    protected void userDataSource(){
        u1 = new Usuario(
                "Roger Santos Silva",
                "roger.santos14@hotmail.com",
                "4430esipK4@m"
        );
        bundle = new Bundle();
        bundle.putString("name", u1.getNome());
        bundle.putString("email", u1.getEmail());
        bundle.putString("password", u1.getSenha());
    }

}