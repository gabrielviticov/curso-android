package aluno.gabriel.treino007.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import aluno.gabriel.treino007.R;
import aluno.gabriel.treino007.controller.ClienteController;
import aluno.gabriel.treino007.controller.ProdutoController;
import aluno.gabriel.treino007.model.Cliente;
import aluno.gabriel.treino007.model.Produto;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;
    ProdutoController produtoController;
    Produto produto;
    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteController = new ClienteController(getApplicationContext());
        produtoController = new ProdutoController(getApplicationContext());

        cliente = new Cliente("Hugo Latinha", "contato.latinhahugo@hotmail.com", "Masculino");

        produto = new Produto("Sabão", "Ipe", 11.90, true);
        if(clienteController.incluir(cliente)){
            Toast.makeText(this, "Cliente "+cliente.getNome()+" foi adicionado com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Cliente "+cliente.getNome()+" não foi adicionado com sucesso", Toast.LENGTH_SHORT).show();
        }

        if(produtoController.incluir(produto)){
            Toast.makeText(this, "Produto "+produto.getNome()+" foi adicionado com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Produto "+produto.getNome()+" não foi adicionado com sucesso", Toast.LENGTH_SHORT).show();
        }
    }
}