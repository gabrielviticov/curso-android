package aluno.gabriel.treino008.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import aluno.gabriel.treino008.core.ApplicationUtil;
import aluno.gabriel.treino008.datamodel.UsuarioDatamodel;
import aluno.gabriel.treino008.model.Usuario;


public class ApplicationDatabase extends SQLiteOpenHelper {


    SQLiteDatabase sqLiteDatabase;

    public ApplicationDatabase(Context context) {
        super(context, ApplicationUtil.DATABASE_NAME, null, ApplicationUtil.VERSION);

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(UsuarioDatamodel.queryCreateTable());
        Log.i(ApplicationUtil.TAG, "onCreate: tabela criada: "+ UsuarioDatamodel.queryCreateTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Boolean queryInsert(String tabela, ContentValues contentValues){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.insert(tabela, null, contentValues) > 0;
        } catch(Exception e){
            Log.e(ApplicationUtil.TAG, "inserir: "+e.getMessage());
        }
        return retorno;
    }

    public Boolean queryDeleteByID(String tabela, Integer id){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.delete(tabela, "ID = ?", new String[]{String.valueOf(id)}) > 0;
        } catch(Exception e){
            Log.e(ApplicationUtil.TAG, "queryDeleteByID: "+e.getMessage());
        }
        return retorno;
    }

    /*
    public Boolean queryAlterTable(String tabela, ContentValues contentValues){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.
        }
    }
     */
}
