package aluno.gabriel.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import aluno.gabriel.appminhaideiadb.R;
import aluno.gabriel.appminhaideiadb.controller.ClienteController;
import aluno.gabriel.appminhaideiadb.controller.ProdutoController;
import aluno.gabriel.appminhaideiadb.datamodel.ClienteDataModel;
import aluno.gabriel.appminhaideiadb.datasource.ApplicationDataSource;
import aluno.gabriel.appminhaideiadb.model.Cliente;

public class MainActivity extends AppCompatActivity {
    ClienteController clienteController;
    ProdutoController produtoController;
    Cliente cliente1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteController = new ClienteController(getApplicationContext());
        produtoController = new ProdutoController(getApplicationContext());

        /*
        for (int i = 0; i < 49; i++) {
            cliente1 = new Cliente(i+"_Pedro Silva", "contato.pedro.silva@gmail.com", "(11)96709-1415", 33, "Masculino");
            clienteController.inserir(cliente1);
        }
        */

        /*
        if(clienteController.inserir(cliente1)){
            Toast.makeText(MainActivity.this, "Cliente "+cliente1.getNome()+" foi adicionado com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Cliente "+cliente1.getNome()+" não foi adicionado com sucesso!", Toast.LENGTH_SHORT).show();
        }
        */
        //cliente1.setId(4);
        /*

        if(clienteController.deletar(cliente1.getId())){
            Toast.makeText(this, "O cliente "+cliente1.getNome()+" foi excluído com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "O cliente "+cliente1.getNome()+" não foi excluído com sucesso", Toast.LENGTH_SHORT).show();
        }
        */

        /*
        if(clienteController.alterar(cliente1)){
            Toast.makeText(this, "O cliente "+cliente1.getNome()+" foi alterado com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "O cliente "+cliente1.getNome()+" não foi alterado com sucesso", Toast.LENGTH_SHORT).show();
        }

         */


        //clienteController.listar();
        for (Cliente obj: clienteController.listar()) {
            Log.i("Cliente", "onCreate: "+obj.getId()+" "+obj.getNome()+" "+obj.getEmail()+" "+obj.getTelefone()+" "+obj.getIdade()+" "+obj.getSexo());
        }

    }
}