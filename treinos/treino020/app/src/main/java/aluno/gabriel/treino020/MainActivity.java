package aluno.gabriel.treino020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText editNome, editEmail, editSenha;
    Button btnCadastrar;
    CheckBox checkNome, checkEmail;
    ToggleButton tgSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        tgSenha = findViewById(R.id.tgSenha);
        checkNome = findViewById(R.id.checkNome);
        checkEmail = findViewById(R.id.checkEmail);

        tgSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tgSenha.isChecked()){
                    editSenha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    editSenha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        checkNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkNome.isChecked()){
                    editNome.setEnabled(false);
                } else {
                    editNome.setEnabled(true);
                }
            }
        });

        checkEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkEmail.isChecked()){
                    editEmail.setEnabled(false);
                } else {
                    editEmail.setEnabled(true);
                }
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editNome.getText().toString()) && TextUtils.isEmpty(editEmail.getText().toString()) && TextUtils.isEmpty(editSenha.getText().toString())){
                    editNome.setError("Informe seu nome completo");
                    editEmail.setError("Informe seu endereço de email");
                    editSenha.setError("Informe a sua senha");
                } else if(TextUtils.isEmpty(editNome.getText().toString())){
                    editNome.setError("Informe seu nome completo");
                } else if(TextUtils.isEmpty(editEmail.getText().toString())){
                    editEmail.setError("Informe seu endereço de email");
                } else if(TextUtils.isEmpty(editSenha.getText().toString())){
                    editSenha.setError("Informe a sua senha");
                }  else {
                    Toast.makeText(MainActivity.this, "Seu nome: "+editNome.getText().toString()+"\nSeu email: "+editEmail.getText().toString()+"\nSua senha: "+editSenha.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}