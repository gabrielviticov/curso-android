package aluno.gabriel.treino002.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import aluno.gabriel.treino002.R;

public class MainActivity extends AppCompatActivity {
    String TAG = "@treino002";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        Log.i(TAG, "usuario transferido! ");
        Log.i(TAG, "nome completo: "+bundle.getString("nome"));
        Log.i(TAG, "email: "+bundle.getString("email"));
        Log.i(TAG, "senha: "+bundle.getString("senha"));
    }

}