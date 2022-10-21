package aluno.gabriel.treino026.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import aluno.gabriel.treino026.BuildConfig;
import aluno.gabriel.treino026.R;

public class SplashActivity extends AppCompatActivity {

    TextView txtNomeApp;
    TextView txtVersaoApp;
    String versionApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        includeElementsById();
        replaceElements();
        transferenceScreen();
    }

    protected void transferenceScreen(){
        Boolean handler = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }

    protected void includeElementsById(){
        txtNomeApp = findViewById(R.id.txtNomeApp);
        txtVersaoApp = findViewById(R.id.txtVersaoApp);
    }

    @SuppressLint("SetTextI18n")
    protected void replaceElements(){
        versionApp = BuildConfig.VERSION_NAME;
        txtVersaoApp.setText("Versão: "+versionApp);

    }
}