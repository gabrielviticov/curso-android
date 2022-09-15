package aluno.gabriel.treino008.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import aluno.gabriel.treino008.R;
import aluno.gabriel.treino008.controller.UsuarioController;
import aluno.gabriel.treino008.model.Usuario;

public class MainActivity extends AppCompatActivity {

    UsuarioController usuarioController;
    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioController = new UsuarioController(getApplicationContext());

        usuario = new Usuario("Gabriel Viticov ", "gabrielviticvo@gmail.com ", "drgabriel2204");
        usuario = new Usuario("Hugo Latinha ", "contato.hugolatinha@hotmail.com ", "hugolatinhaquefalaparça001");
        usuario.setId(2);

        /*
        if(usuarioController.inserir(usuario)){
            Toast.makeText(this, "O usuario "+usuario.getNome()+" foi cadastrado!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "O usuario "+usuario.getNome()+" não foi cadastrado", Toast.LENGTH_SHORT).show();
        }
        */
        if(usuarioController.deletar(usuario.getId())){
            Toast.makeText(this, "O usuario "+usuario.getNome()+" foi DELETADO!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "O usuario "+usuario.getNome()+" não foi deletado", Toast.LENGTH_SHORT).show();
        }
    }
}