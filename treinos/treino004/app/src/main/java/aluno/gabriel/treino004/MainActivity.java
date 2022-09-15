package aluno.gabriel.treino004;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "@treino004";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    String nome;
    int codigo;
    float preco;
    boolean estoque;

    public static final String NAME_PREFERENCES = "sharedPreferencesData";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences(NAME_PREFERENCES, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        nome = "Xbox One 512GB";
        codigo = 5569013;
        preco = 990.90f;
        estoque = true;

        editor.putString("nome", nome);
        editor.putInt("codigo", codigo);
        editor.putFloat("preco", preco);
        editor.putBoolean("estoque", estoque);

        editor.apply();

        Log.d(TAG, "nome do produto: "+sharedPreferences.getString("nome", "desconhecido"));
        Log.d(TAG, "codigo do produto: "+sharedPreferences.getInt("codigo", -1));
        Log.d(TAG, "preço do produto: R$"+sharedPreferences.getFloat("preco", -0.00f));
        Log.d(TAG, "tem no estoque? "+sharedPreferences.getBoolean("estoque", false));
    }
}