package aluno.gabriel.treino016.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import aluno.gabriel.treino016.core.AppUtil;
import aluno.gabriel.treino016.datamodel.UsuarioDataModel;


public class AppDataBase extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;
    public static final String DATABASE_NAME = "Treino016.sqlite";
    public static final Integer DATABASE_VERSION = 1;

    public AppDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(UsuarioDataModel.queryCreateTable());
            Log.i(AppUtil.TAG, "onCreate: "+UsuarioDataModel.queryCreateTable());
        }catch(SQLException e){
            Log.e(AppUtil.TAG, "onCreate: "+e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Boolean queryInsertInto(String tabela, ContentValues contentValues){
        boolean retorno = false;

        try {
            retorno = sqLiteDatabase.insert(tabela, null, contentValues) > 0;
        } catch(Exception e){
            Log.e(AppUtil.TAG, "queryInsertInto: "+e.getMessage());
        }
        return retorno;
    }

    public Boolean queryDeleteByID(String tabela, Integer id){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.delete(tabela, "ID = ?", new String[]{String.valueOf(id)}) > 0;
        }catch(Exception e){
            Log.e(AppUtil.TAG, "queryDeleteByID: "+e.getMessage());
        }
        return retorno;
    }

    public Boolean queryUpdateByValues(String tabela, ContentValues contentValues){
        boolean retorno = false;

        try {
            retorno = sqLiteDatabase.update(tabela, contentValues, "ID = ?", new String[] {String.valueOf("id")}) > 0;
        } catch(Exception e){
            Log.e(AppUtil.TAG, "queryUpdateByValues: "+e.getMessage());
        }

        return retorno;
    }
}
