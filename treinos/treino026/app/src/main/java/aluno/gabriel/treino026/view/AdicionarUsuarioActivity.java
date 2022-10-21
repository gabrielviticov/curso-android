package aluno.gabriel.treino026.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import aluno.gabriel.treino026.R;
import aluno.gabriel.treino026.controller.UsuariosController;
import aluno.gabriel.treino026.model.Usuarios;

public class AdicionarUsuarioActivity extends AppCompatActivity {

    AlertDialog.Builder action;
    Usuarios usuarios;
    UsuariosController usuariosController;
    Intent intent;
    TextView txtCadastrarUsuario;
    EditText editNomeCompleto;
    EditText editRegistro;
    EditText editEmail;
    EditText editSenha;
    CheckBox ckMostrarSenha;
    Button ckLimparCampos;
    Button btnCadastrar;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_usuario);

        includeElementsById();
        programmingEventsByElementes();
    }

    protected void includeElementsById(){
        txtCadastrarUsuario = findViewById(R.id.txtCadastrarUsuario);
        editNomeCompleto = findViewById(R.id.editNomeCompleto);
        editRegistro = findViewById(R.id.editRegistro);
        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);
        ckMostrarSenha = findViewById(R.id.ckMostrarSenha);
        ckLimparCampos = findViewById(R.id.ckLimparCampos);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnCancelar = findViewById(R.id.btnCancelar);
    }

    protected void programmingEventsByElementes(){
        ckMostrarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!ckMostrarSenha.isChecked()) {
                    editSenha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    editSenha.requestFocus();
                    editSenha.setSelection(editSenha.length());
                } else {
                    editSenha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    editSenha.requestFocus();
                    editSenha.setSelection(editSenha.length());
                }
            }
        });

        ckLimparCampos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(!TextUtils.isEmpty(editNomeCompleto.getText().toString()) || !TextUtils.isEmpty(editRegistro.getText().toString()) || !TextUtils.isEmpty(editEmail.getText().toString()) || !TextUtils.isEmpty(editSenha.getText().toString())){
                        editNomeCompleto.getText().clear();
                        editRegistro.getText().clear();
                        editEmail.getText().clear();
                        editSenha.getText().clear();
                        if(TextUtils.isEmpty(editNomeCompleto.getText().toString())){
                            editNomeCompleto.requestFocus();
                        }
                    }
                }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertScreenAction();
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertIntoUsuarios();
            }
        });
    }

    public void insertIntoUsuarios() {
        usuarios = new Usuarios();
        usuariosController = new UsuariosController(this);
        boolean dadosOk = true;


        if(dadosOk){
            if(TextUtils.isEmpty(editNomeCompleto.getText().toString())){
                dadosOk = false;
                editNomeCompleto.setError("*");
            } if(TextUtils.isEmpty(editRegistro.getText().toString())){
                dadosOk = false;
                editRegistro.setError("*");
            } if(TextUtils.isEmpty(editEmail.getText().toString())){
                dadosOk = false;
                editEmail.setError("*");
            } if(TextUtils.isEmpty(editSenha.getText().toString())){
                dadosOk = false;
                editSenha.setError("*");
            }
        }

        if(dadosOk){

            usuarios.setNomeCompleto(editNomeCompleto.getText().toString());
            usuarios.setRegistro(Integer.parseInt(editRegistro.getText().toString()));
            usuarios.setEmail(editEmail.getText().toString());
            usuarios.setSenha(editSenha.getText().toString());

            if(usuariosController.incluir(usuarios)){
                editNomeCompleto.getText().clear();
                editRegistro.getText().clear();
                editEmail.getText().clear();
                editSenha.getText().clear();

                editNomeCompleto.requestFocus();
                ckMostrarSenha.setChecked(false);

                Toast.makeText(this, "O usuário: "+usuarios.getNomeCompleto()+" foi adicionado!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "O usuário não foi incluído no Banco de Dados", Toast.LENGTH_SHORT).show();
            }


        }


    }

    public void alertScreenAction(){
        action = new AlertDialog.Builder(AdicionarUsuarioActivity.this);

        action.setTitle("Sair da Tela").setMessage("Você deseja voltar para a tela anterior?").setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                intent = new Intent(AdicionarUsuarioActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        action.setNegativeButton("Não", null).show();
    }
}