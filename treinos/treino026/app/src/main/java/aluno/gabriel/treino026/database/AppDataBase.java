package aluno.gabriel.treino026.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import aluno.gabriel.treino026.core.AppUtil;
import aluno.gabriel.treino026.datamodel.UsuariosDataModel;


public class AppDataBase extends SQLiteOpenHelper {
    static SQLiteDatabase sqLiteDatabase;
    public static final String DATABASE_NAME = "Treino026.sqlite";
    public static final Integer DATABASE_VERSION = 1;

    public AppDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        try {
            sqLiteDatabase.execSQL(UsuariosDataModel.queryCreateTable());
            Log.i(AppUtil.TAG, "onCreate: tabela criada: " + UsuariosDataModel.queryCreateTable());
        } catch (SQLException e){
            Log.e(AppUtil.TAG, "onCreate: "+e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public static Boolean inserir(String tabela, ContentValues contentValues){
        Boolean retorno = false;

        try {
            retorno = sqLiteDatabase.insert(tabela, null, contentValues) > 0;
            Log.i(AppUtil.TAG, "inserir: ");
        } catch(Exception e){
            Log.e(AppUtil.TAG, "inserir: "+e.getMessage());
        }

        return retorno;
    }
}
