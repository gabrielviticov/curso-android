package aluno.gabriel.treino018;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    EditText editNome, editTelefone;
    Button btn_Salvar, btn_Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editNome = findViewById(R.id.editNome);
        editTelefone = findViewById(R.id.editTelefone);
        btn_Salvar = findViewById(R.id.btnSalvar);
        btn_Voltar = findViewById(R.id.btn_Voltar);

        btn_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pessoa p = new Pessoa();
                p.nome = editNome.getText().toString();
                p.telefone = editTelefone.getText().toString();

                AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "contatos").build();
                PessoaDao dao = db.pessoaDao();


                dao.inserir(p);
            }
        });

        btn_Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}