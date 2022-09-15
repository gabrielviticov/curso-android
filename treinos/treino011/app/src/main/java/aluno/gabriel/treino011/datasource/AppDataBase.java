package aluno.gabriel.treino011.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import aluno.gabriel.treino011.core.AppUtil;
import aluno.gabriel.treino011.datamodel.UsuarioDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Treino011.sqlite";
    public static final Integer DATABASE_VERSION = 1;
    SQLiteDatabase sqLiteDatabase;

    public AppDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(UsuarioDataModel.Companion.queryCreateTable());
            Log.i(AppUtil.Companion.getTAG(), "onCreate: tabela criada: "+UsuarioDataModel.Companion.queryCreateTable());
        } catch(SQLException e){
            Log.e(AppUtil.Companion.getTAG(), "onCreate: "+e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Boolean incluir(String tabela, ContentValues contentValues){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.insert(tabela, null, contentValues) > 0;
        } catch(Exception e){
            Log.e(AppUtil.Companion.getTAG(), "incluir: "+e.getMessage());
        }
        return retorno;
    }

    public Boolean desfazer(String tabela, Integer id){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.delete(tabela, "id = ?", new String[]{String.valueOf(id)}) > 0;
        }catch(Exception e){
            Log.e(AppUtil.Companion.getTAG(), "desfazer: "+e.getMessage());
        }
        return retorno;
    }
}
