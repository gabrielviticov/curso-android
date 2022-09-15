package aluno.gabriel.aulanivelamentocolecoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Tipos de dados primitivos - int, double, float, long
    //Tipos de dados não primitivos "Classes" - Integer, Double, Float, Long
    //Declarando uma coleção no Java - Usasse as classes e não os tipos primitivos
    List<Integer> inteiros;
    List<Float> precos;
    List<Cliente> clientes;
    Cliente cliente1, cliente2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inteiros = new ArrayList<>();
        precos = new ArrayList<>();
        clientes = new ArrayList<>();

        inteiros.add(10);   //elemento de indíce 0
        inteiros.add(22);   //elemento de indíce 1
        inteiros.add(43);   //elemento de indíce 2

        precos.add(117.30f);
        precos.add(448.97f);
        precos.add(55.49f);

        cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Gabriel Viticov");
        cliente1.setEmail("gabrielviticvo@gmail.com");

        cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Hugo Castillo");
        cliente2.setEmail("contanto.castillo@gmail.com");

        clientes.add(cliente1);
        clientes.add(cliente2);

        /*
        for (int i = 0; i < inteiros.size(); i++) {
            Toast.makeText(this, i+" Elemento: "+inteiros.get(i), Toast.LENGTH_SHORT).show();
        }

         */

        /*
        for (Integer numeros: inteiros){
            Toast.makeText(this, "Elemento: "+numeros, Toast.LENGTH_SHORT).show();
        }

         */

        /*
        for (Float preco: precos
             ) {
            Toast.makeText(this, ""+preco, Toast.LENGTH_SHORT).show();
        }

         */

        for (Cliente obj: clientes
             ) {
            Toast.makeText(this, ""+obj.getId(), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, ""+obj.getNome(), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, ""+obj.getEmail(), Toast.LENGTH_SHORT).show();
        }
    }
}