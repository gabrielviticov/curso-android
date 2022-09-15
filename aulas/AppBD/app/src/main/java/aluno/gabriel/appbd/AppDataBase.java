package aluno.gabriel.appbd;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class AppDataBase extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;
    public static final String DB_NAME = "AULA_DB.sqlite";
    public static final int DB_VERSION = 1;

    public AppDataBase(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String tabelaCliente = "CREATE TABLE cliente \n" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                " nome TEXT,\n" +
                " salario REAL, \n" +
                " preco NUMERIC,\n" +
                " idade INTEGER,\n" +
                " ativo INTEGER,\n" +
                " dataCadastro TEXT,\n" +
                " horaCadastro TEXT\n" +
                " )";

        try {
            sqLiteDatabase.execSQL(tabelaCliente);
        } catch(SQLException e){
            Log.e("TAG", "onCreate: "+e.getMessage());
        }

    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
