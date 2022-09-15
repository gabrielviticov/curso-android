package aluno.gabriel.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import aluno.gabriel.appminhaideia.R;
import aluno.gabriel.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {
    Cliente cliente;
    String TAG = "@AppMinhaIdeia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente = new Cliente(
                "Gabriel Viticov",
                "Masculino",
                20,
                "gabrielviticov.ctt@gmail.com",
                "(11) 95792-3631"
        );

        Log.i(TAG, "Cliente cadastrado!");
        Log.i(TAG, "Nome do cliente: "+cliente.getNome());
        Log.i(TAG, "Sexo do cliente: "+cliente.getSexo().charAt(0));
        Log.i(TAG, "Idade do cliente: "+cliente.getIdade());
        Log.i(TAG, "Email do cliente: "+cliente.getEmail());
        Log.i(TAG, "Telefone do cliente: "+cliente.getTelefone());
    }
}