package aluno.gabriel.treino016.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import aluno.gabriel.treino016.R;
import aluno.gabriel.treino016.controller.UsuarioController;
import aluno.gabriel.treino016.model.Usuario;

public class MainActivity extends AppCompatActivity {
    UsuarioController usuarioController;
    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioController = new UsuarioController(getApplicationContext());

        usuario = new Usuario(1, "Gabriel Viticov Plata de Souza", "gabrielviticov.ctt@gmail.com", "exampleofpassword2204");
        usuario = new Usuario(2, "Higor Tamares", "higor.tamares@hotmail.com", "higorexamplepasswd2");
        usuario = new Usuario(3, "Talita Rubens", "talita.rubs@gmail.com", "senhapratalitafds234");
        usuario = new Usuario(4, "Rodolfo Dias", "vanessa.elite24@gmail.com", "vanessalinda2201");


        if(usuarioController.inserir(usuario)){
            Toast.makeText(this, "O usuário: "+usuario.getNome()+" foi inserido na base de dados!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "O usuário não foi inserido no banco de dados", Toast.LENGTH_SHORT).show();
        }


        /*
        if(usuarioController.deletar(5)){
            Toast.makeText(this, "O usuário: "+usuario.getNome()+" foi excluído no banco de dados", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "O usuário não foi excluído", Toast.LENGTH_SHORT).show();
        }
        */

        if(usuarioController.alterar(usuario)){
            Toast.makeText(this, "Usuário agora se chamada: "+usuario.getNome(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Nenhuma alteração foi feita", Toast.LENGTH_SHORT).show();
        }
    }
}