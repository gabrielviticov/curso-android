package aluno.gabriel.treino027.view;

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
import android.widget.TextView;
import android.widget.Toast;

import aluno.gabriel.treino027.R;
import aluno.gabriel.treino027.controller.AlunosController;
import aluno.gabriel.treino027.controller.DisciplinaController;
import aluno.gabriel.treino027.core.AppUtil;

public class LoginActivity extends AppCompatActivity {

    TextView txtTitulo;
    EditText editRGM;
    EditText editSenha;
    SwitchCompat swMostrarSenha;
    Button btnLimparCampos;
    Button btnEntrar;
    Button btnCadastrar;
    Intent intent;
    AlunosController alunosController;
    DisciplinaController disciplinaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findElementsById();
        programmingEventsByElements();
        configureFields();
        programmingInteractions();

        alunosController = new AlunosController(getApplicationContext());
        disciplinaController = new DisciplinaController(getApplicationContext());
    }

    protected void findElementsById(){
        txtTitulo = findViewById(R.id.txtTitulo);
        editRGM = findViewById(R.id.editRGM);
        editSenha = findViewById(R.id.editSenha);
        swMostrarSenha = findViewById(R.id.swMostrarSenha);
        btnLimparCampos = findViewById(R.id.btnLimparCampos);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnCadastrar = findViewById(R.id.btnCadastrar);
    }

    protected void programmingEventsByElements(){

        //Limpar Campos
        btnLimparCampos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(editRGM.getText().toString()) || !TextUtils.isEmpty(editSenha.getText().toString())){
                    editRGM.getText().clear();
                    editSenha.getText().clear();
                    editRGM.requestFocus();
                }
            }
        });

        //MostrarSenha
        swMostrarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!swMostrarSenha.isChecked()){
                    editSenha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    editSenha.setSelection(editSenha.length());
                } else if(swMostrarSenha.isChecked()){
                    editSenha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    editSenha.setSelection(editSenha.length());
                }
            }
        });
    }

    protected void configureFields(){
        txtTitulo.setText("Tela de Login");
        txtTitulo.setTextSize(20);

        btnLimparCampos.setText("Limpar campos");
        btnLimparCampos.setWidth(80);

        btnEntrar.setText("Entrar");
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setWidth(80);

        swMostrarSenha.setText("Mostrar senha");
        swMostrarSenha.setWidth(80);
    }

    protected void programmingInteractions(){
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editRGM.getText().toString()) && TextUtils.isEmpty(editSenha.getText().toString())){
                    editRGM.setError("*");
                    editSenha.setError("*");
                } else if(TextUtils.isEmpty(editRGM.getText().toString())){
                    editRGM.setError("*");
                } else if(TextUtils.isEmpty(editSenha.getText().toString())){
                    editSenha.setError("*");
                } else {
                    editRGM.setEnabled(false);
                    editSenha.setEnabled(false);
                }

                if(!TextUtils.isEmpty(editRGM.getText().toString()) && !TextUtils.isEmpty(editSenha.getText().toString())){
                    intent = new Intent(LoginActivity.this, PortalDoAlunoActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(LoginActivity.this, CadastrarAlunoActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}