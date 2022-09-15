package aluno.gabriel.treino009.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import aluno.gabriel.treino009.core.ApplicationUtil;
import aluno.gabriel.treino009.datamodel.ProdutoDataModel;


public class ApplicationDataBase extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;

    public ApplicationDataBase(Context context) {
        super(context, ApplicationUtil.DATABASE_NAME, null, ApplicationUtil.DATABASE_VERSION);

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ProdutoDataModel.queryCreateTable());
        Log.i(ApplicationUtil.TAG, "onCreate: tabela "+ApplicationUtil.TABLE_NAME+" foi criada: "+ProdutoDataModel.queryCreateTable());
        sqLiteDatabase.execSQL("DELETE FROM PRODUTOS;");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Boolean inserir(String tabela, ContentValues contentValues){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.insert(tabela, null, contentValues) > 0;
        } catch(Exception e){
            Log.e(ApplicationUtil.TAG, "inserir: "+e.getMessage());
        }
        return retorno;
    }

    public Boolean deletar(String tabela, Integer id){
        boolean retorno = false;
        try {
            retorno = sqLiteDatabase.delete(tabela, "ID = ?", new String[] {String.valueOf(id)}) > 0;
        } catch(Exception e) {
            Log.e(ApplicationUtil.TAG, "deletar: "+e.getMessage());
        }
        return retorno;
    }

    public String truncateTable(){
        return "DELETE FROM "+ApplicationUtil.TABLE_NAME+";";
    }

    public String resetByID(){
        return "DELETE FROM `sqlite_sequence` WHERE `name` = 'PRODUTOS'";
    }


}
