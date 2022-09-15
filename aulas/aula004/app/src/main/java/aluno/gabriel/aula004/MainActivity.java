package aluno.gabriel.aula004;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

//SharedPreferences
public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public static final String TAG = "@aula004";
    public static final String NAME_PREFERENCES = "PreferencesUtil";    //nome do arquivo XML do sharedPreferences

    String nomeProduto;
    int codigoProduto;
    float precoProduto;
    boolean estoque;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences(NAME_PREFERENCES, Context.MODE_PRIVATE);  //será passado dois parâmetros: 1) o nome do arquivo SP (NAME_PREFERENCES). 2) O modulo de acesso (private)
        Log.i(TAG, "pasta sharedPreferences criada ");

        editor = sharedPreferences.edit();

        nomeProduto = "PlayStation 5 825GB";
        codigoProduto = 13442570;
        precoProduto = 4199.90f;
        estoque = true;

        //pegar os dados acima e salvar utilizando o método "put".
        editor.putString("nomeProduto", nomeProduto);
        editor.putInt("codigoProduto", codigoProduto);
        editor.putFloat("precoProduto", precoProduto);
        editor.putBoolean("estoque", estoque);

        editor.apply();
        //editor.remove("nomeProduto");
        //editor.apply();
        Log.i(TAG, "onCreate: ");

        Log.d(TAG, "Nome do produto: "+sharedPreferences.getString("nomeProduto", "Produto desconhecido"));
        Log.d(TAG, "Código do produto: "+sharedPreferences.getInt("codigoProduto", -1));
        Log.d(TAG, "Preço do produto: R$"+sharedPreferences.getFloat("precoProduto", 0.00f));
        Log.d(TAG, "Tem no estoque: "+sharedPreferences.getBoolean("estoque", false));

    }
}

/*
1) Criar a pasta do sharedPreferences
    1. SharedPreferences sharedPreferences -> Instaciar o objeto da Interface sharedPreferences
    2. public static final String NAME_PREFERENCES -> Declarar o nome da pasta para conter o arquivo XML do sharedPreferences
    3. sharedPreferences = getSharedPreferences(<nome_declarado>, <tipo_de_acesso>) -> Informar o nome do arquivo e o modulo de acesso a ele

2) Salvar os dados
    1. SharedPreferences.Editor editor -> Instanciar um objeto para salvar os dados (os dados são os atributos da classe)
    2. editor = sharedPreferences.edit() -> pegar o arquivo para editar
    3. editor.putString("nomeProduto", nomeProduto)
    4. editor.apply() -> aplicar as mudanças

3) Recuperar os dados
    Log.i(TAG, "onCreate: "+sharedPreferences.getString("<key>", "valueAlt")); -> você irá passar a key e o valor alternativo da key, ex: "nomeProduto", para valor alternativo, você pode colocar "Produto desconhecido", pois ele não encontrou um valor para key.

4) Observações:
    editor.remove("<key>") -> apaga um atributo no sharedPreferences
    editor.clear() -> apaga todos os registros
 */
