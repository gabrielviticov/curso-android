package aluno.gabriel.aula002.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import aluno.gabriel.aula002.R;

public class MainActivity extends AppCompatActivity {
    String TAG = "@aula002";
    TextView txtNome, txtSexo, txtIdade, txtEmail, txtTelefone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();

        txtNome = findViewById(R.id.txtNome);
        txtSexo = findViewById(R.id.txtSexo);
        txtIdade = findViewById(R.id.txtIdade);
        txtEmail = findViewById(R.id.txtEmail);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtNome.setText("O nome completo do cliente: "+bundle.getString("nome"));
        txtSexo.setText("Você é do sexo: "+bundle.getString("sexo"));
        txtIdade.setText("Sua idade: "+bundle.getInt("idade"));
        txtEmail.setText("Seu endereço de email: "+bundle.getString("email"));
        txtTelefone.setText("Seu número de telefone: "+bundle.getString("telefone"));
    }


}