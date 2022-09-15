package aluno.gabriel.treino005;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "@treino005";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public String nome;
    public int codigo;
    public float preco;
    public boolean estoque;

    public static final String NAME_PREFERENCES = "sharedPreferencesDocument";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSharedPreferences();
    }

    protected void getSharedPreferences(){
        sharedPreferences = getSharedPreferences(NAME_PREFERENCES, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        nome = "Samsung Galaxy S10e";
        codigo = 59842301;
        preco = 1550.90f;

        editor.putString("nome", nome);
        editor.putInt("codigo", codigo);
        editor.putFloat("preco", preco);
        editor.putBoolean("estoque", estoque);

        editor.apply();

        Log.d(TAG, "getSharedPreferences: ");
        Log.d(TAG, "nome do produto: "+sharedPreferences.getString("nome", "desconhecido"));
        Log.d(TAG, "codigo do produto: "+sharedPreferences.getInt("codigo", -0));
        Log.d(TAG, "preço do produto: R$"+sharedPreferences.getFloat("preco", -0.00f));
        Log.d(TAG, "Tem no estoque? "+sharedPreferences.getBoolean("estoque", false));
    }
}