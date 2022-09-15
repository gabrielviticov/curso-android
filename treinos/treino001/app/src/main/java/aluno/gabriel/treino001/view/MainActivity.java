package aluno.gabriel.treino001.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import aluno.gabriel.treino001.R;

public class MainActivity extends AppCompatActivity {
    TextView txtNome, txtEmail, txtSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();

        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

        txtNome.setText("Nome completo: "+bundle.getString("name"));
        txtEmail.setText("Email: "+bundle.getString("email"));
        txtSenha.setText("Senha: "+bundle.getString("password"));

    }
}