package aluno.gabriel.treino006.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import aluno.gabriel.treino006.core.ApplicationUtil;
import aluno.gabriel.treino006.datamodel.UsuarioDataModel;

public class ApplicationDataBase extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;

    public static final String DB_NAME = "Treino006.sqlite";
    public static final Integer DB_VERSION = 1;

    public ApplicationDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.i(ApplicationUtil.TAG, "ApplicationDatabase: criando o banco de dados...");

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(UsuarioDataModel.queryCreateTable());
        Log.i(ApplicationUtil.TAG, "onCreate: tabela criada "+UsuarioDataModel.queryCreateTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean queryInsertInto(String tabela, ContentValues values){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.insert(tabela, null, values) > 0;
        } catch(Exception e){
            Log.w(ApplicationUtil.TAG, "queryInsertInto: "+e.getMessage());
        }
        return retorno;
    }
}
