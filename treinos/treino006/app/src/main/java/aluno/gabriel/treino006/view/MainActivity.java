package aluno.gabriel.treino006.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import aluno.gabriel.treino006.R;
import aluno.gabriel.treino006.controller.UsuarioController;
import aluno.gabriel.treino006.model.Usuario;

public class MainActivity extends AppCompatActivity {
    UsuarioController usuarioController;
    Usuario u1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioController = new UsuarioController(getApplicationContext());

        u1 = new Usuario("Gabriel Viticov", "gabrielviticvo@gmail.com", "E410ttyW#$!__+kj");

        if(usuarioController.inserir(u1)){
            Toast.makeText(this, "Usuario "+u1.getNome()+" foi inserido com sucesso", Toast.LENGTH_SHORT).show();
        }
    }
}