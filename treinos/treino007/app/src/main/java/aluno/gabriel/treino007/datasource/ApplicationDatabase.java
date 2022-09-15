package aluno.gabriel.treino007.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import aluno.gabriel.treino007.api.ApplicationUtil;
import aluno.gabriel.treino007.datamodel.ClienteDataModel;
import aluno.gabriel.treino007.datamodel.ProdutoDataModel;
import aluno.gabriel.treino007.model.Cliente;


public class ApplicationDatabase extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;

    public static final String NAME = "Treino007.sqlite";
    public static final Integer VERSION = 1;

    public ApplicationDatabase(Context context) {
        super(context, NAME, null, VERSION);

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ClienteDataModel.getQueryCreateTable());
        sqLiteDatabase.execSQL(ProdutoDataModel.getQueryCreateTable());
        Log.i(ApplicationUtil.TAG, "onCreate: tabela criada: "+ClienteDataModel.getQueryCreateTable());
        Log.i(ApplicationUtil.TAG, "onCreate: tabela criada: "+ProdutoDataModel.getQueryCreateTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean inserir(String tabela, ContentValues contentValues){
        boolean retorno = false;

        try {
            retorno = sqLiteDatabase.insert(tabela, null, contentValues) > 0;
        } catch(Exception e){
            Log.e(ApplicationUtil.TAG, "inserir: "+e.getMessage());
        }
        return retorno;
    }


}
