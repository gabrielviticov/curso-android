package aluno.gabriel.treino011.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import aluno.gabriel.treino011.R;
import aluno.gabriel.treino011.controller.UsuarioController;
import aluno.gabriel.treino011.core.AppUtil;
import aluno.gabriel.treino011.model.Usuario;

public class MainActivity extends AppCompatActivity {

    UsuarioController usuarioController;
    Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioController = new UsuarioController(getApplicationContext());
        usuario = new Usuario("Gabriel Viticov Plata de Souza", "gabrielviticov.ctt@gmail.com", "e2905MK#_09Er");
        usuario = new Usuario("Edson Martins Ferreira Santos", "contato.construtoraedson@gmail.com", "28071998katarina");
        usuario = new Usuario("Julia Costas", "jujuh.silva@hotmail.com", "22032017");
        usuario.setId(3);

        if(usuarioController.inserir(usuario)){
            Toast.makeText(this, "O usuário "+usuario.getNome()+" foi inserido com sucesso no banco de dados!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Não foi feito nenhuma inserção no banco de dados! ", Toast.LENGTH_SHORT).show();
        }

        if(usuarioController.deletar(3)){
            Toast.makeText(this, "O usuário "+usuario.getNome()+" foi excluído da base de dados!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Nenhuma exclusão foi feita!", Toast.LENGTH_SHORT).show();
        }
    }
}