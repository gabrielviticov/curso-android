package aluno.gabriel.treino025.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import aluno.gabriel.treino025.R;

public class PortalDoAluno extends AppCompatActivity {

    TextView txtRgm, txtSenha;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal_do_aluno);

        Bundle bundle = getIntent().getExtras();

        txtRgm = findViewById(R.id.txtRGM);
        txtSenha = findViewById(R.id.txtSenha);
        btnVoltar = findViewById(R.id.btnVoltar);

        txtRgm.setText(""+bundle.getString("rgm"));
        txtSenha.setText(""+bundle.getString("senha"));

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PortalDoAluno.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}