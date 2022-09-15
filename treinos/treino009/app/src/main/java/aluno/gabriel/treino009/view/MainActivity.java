package aluno.gabriel.treino009.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import aluno.gabriel.treino009.R;
import aluno.gabriel.treino009.controller.ProdutoController;
import aluno.gabriel.treino009.database.ApplicationDataBase;
import aluno.gabriel.treino009.model.Produto;

public class MainActivity extends AppCompatActivity {
    ProdutoController produtoController;
    Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produtoController = new ProdutoController(getApplicationContext());

        produto = new Produto("Monitor Samsung 28pol 120Hz 1440p", "Samsung", 2190.90, 430);

        /*
        if(produtoController.inserir(produto)){
            Toast.makeText(this, "O produto "+produto.getNome()+" foi adicionado no Banco de Dados!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "O produto "+produto.getNome()+" não foi adicionado no Banco de Dados", Toast.LENGTH_SHORT).show();
        }
        */
    }
}