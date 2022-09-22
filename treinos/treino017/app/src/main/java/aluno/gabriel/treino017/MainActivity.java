package aluno.gabriel.treino017;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editEmail, editSenha;
    Button btnEntrar;
    SwitchCompat swMostrarSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);
        btnEntrar = findViewById(R.id.btnEntrar);
        swMostrarSenha = findViewById(R.id.swMostrarSenha);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editEmail.getText().toString()) && TextUtils.isEmpty(editSenha.getText().toString())){
                    editEmail.setError("*");
                    editSenha.setError("*");
                    Toast.makeText(MainActivity.this, "Os campos acima precisam ser preenchidos!", Toast.LENGTH_SHORT).show();
                } else if(TextUtils.isEmpty(editEmail.getText().toString())){
                    editEmail.setError("*");
                    Toast.makeText(MainActivity.this, "O email não foi inserido. Por favor, preencha o campo!", Toast.LENGTH_SHORT).show();
                } else if(TextUtils.isEmpty(editSenha.getText().toString())){
                    editSenha.setError("*");
                    Toast.makeText(MainActivity.this, "A senha não foi inserida. Por favor, preencha o campo!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Todos os campos foram preenchidos!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        swMostrarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.swMostrarSenha){
                    if(editSenha.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                        editSenha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    } else {
                        editSenha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                }
            }
        });

    }
}