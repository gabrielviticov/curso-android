package aluno.gabriel.treino003.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import aluno.gabriel.treino003.R;
import aluno.gabriel.treino003.core.ApplicationUtil;

public class MainActivity extends AppCompatActivity {
    TextView txtNome, txtEmail, txtSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userData();
    }

    protected void userData(){
        Bundle bundle = getIntent().getExtras();
        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

        txtNome.setText("Seu nome: "+bundle.getString("name"));
        txtEmail.setText("Seu email: "+bundle.getString("email"));
        txtSenha.setText("Sua senha: "+bundle.getString("password"));
    }
}