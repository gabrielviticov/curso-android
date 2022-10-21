package aluno.gabriel.treino025.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import aluno.gabriel.treino025.R;

public class LoginActivity extends AppCompatActivity {
    EditText editRGM, editSenha;
    SwitchCompat swMostraSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        applyComponents();
    }

    protected void applyComponents(){
        editRGM = findViewById(R.id.editRGM);
        editSenha = findViewById(R.id.editSenha);
        btnEntrar = findViewById(R.id.btnEntrar);
        swMostraSenha = findViewById(R.id.swMostrarSenha);

        swMostraSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!swMostraSenha.isChecked()){
                    editSenha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    editSenha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editRGM.getText().toString()) && TextUtils.isEmpty(editSenha.getText().toString())){
                    editRGM.setError("*");
                    editSenha.setError("*");
                    Toast.makeText(LoginActivity.this, "Erro! Ambos os campos devem ser inseridos obrigatoriamente!", Toast.LENGTH_LONG).show();
                } else if(TextUtils.isEmpty(editRGM.getText().toString())){
                    editRGM.setError("*");
                    Toast.makeText(LoginActivity.this, "O campo RGM/CPF é obrigatório a inserção!", Toast.LENGTH_LONG).show();
                } else if(TextUtils.isEmpty(editSenha.getText().toString())){
                    editSenha.setError("*");
                    Toast.makeText(LoginActivity.this, "O campo Senha é obrigatório a inserção!", Toast.LENGTH_LONG).show();
                } else {
                    editRGM.setEnabled(false);
                    editSenha.setEnabled(false);
                    Toast.makeText(LoginActivity.this, "A inserção foi realizada com sucesso!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, PortalDoAluno.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("rgm", editRGM.getText().toString());
                    bundle.putString("senha", editSenha.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                    finish();
                    }
                }
        });
    }
}