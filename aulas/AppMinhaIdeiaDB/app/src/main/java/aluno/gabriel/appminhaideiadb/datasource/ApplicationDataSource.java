package aluno.gabriel.appminhaideiadb.datasource;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import aluno.gabriel.appminhaideiadb.api.ApplicationUtil;
import aluno.gabriel.appminhaideiadb.datamodel.ClienteDataModel;
import aluno.gabriel.appminhaideiadb.datamodel.ProdutoDataModel;
import aluno.gabriel.appminhaideiadb.model.Cliente;

public class ApplicationDataSource extends SQLiteOpenHelper {
    public static final String DB_NAME = "AppMinhaIdeia.sqlite";
    public static final Integer DB_VERSION = 1;

    SQLiteDatabase sqLiteDatabase, db;
    Cliente cliente;

    public ApplicationDataSource(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.i(ApplicationUtil.TAG, "ApplicationDataSource: Banco de Dados criado.");

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ClienteDataModel.createTableQuery());
        sqLiteDatabase.execSQL(ProdutoDataModel.queryCreateTable());
        Log.i(ApplicationUtil.TAG, "onCreate: "+ClienteDataModel.createTableQuery());
        Log.i(ApplicationUtil.TAG, "onCreate: "+ProdutoDataModel.queryCreateTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    /**
     * Metódo para incluir dados no Banco de Dados
     * @return
     */
    public boolean queryInsert(String db_table, ContentValues contentValues){
        boolean retorno = false;
        try {
            //o que deve ser feito?
            //salvar os dados no banco de dados.

            retorno = sqLiteDatabase.insert(db_table, null, contentValues) > 0;
        } catch(Exception e){
            Log.i(ApplicationUtil.TAG, "queryInsert: "+e.getMessage());
        }
        return retorno;
    }

    public boolean queryDeleteByID(String tabela, Integer id){
        boolean retorno = false;

        try {
            retorno = sqLiteDatabase.delete(tabela, "ID = ?", new String[] {String.valueOf(id)}) > 0;
        } catch(Exception e){
            Log.e(ApplicationUtil.TAG, "queryDeleteByID: "+e.getMessage());
        }
        return retorno;
    }

    public boolean queryUpdateByID(String tabela, ContentValues contentValues){
        boolean retorno = false;

        try {
            retorno = sqLiteDatabase.update(tabela, contentValues, "ID = ?", new String[] {String.valueOf(contentValues.get("id"))}) > 0;
        } catch(Exception e){
            Log.e(ApplicationUtil.TAG, "queryUpdateByID: "+e.getMessage());
        }
        return retorno;
    }

    @SuppressLint("Range")
    public List<Cliente> getAllClientes(String tabela){
        sqLiteDatabase = getReadableDatabase();
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM "+tabela;

        Cursor cursor;

        cursor = sqLiteDatabase.rawQuery(sql, null);

        if(cursor.moveToFirst()){
            do{
                cliente = new Cliente();
                cliente.setId(cursor.getInt(cursor.getColumnIndex(ClienteDataModel.ID)));
                cliente.setNome(cursor.getString(cursor.getColumnIndex(ClienteDataModel.NAME)));
                cliente.setEmail(cursor.getString(cursor.getColumnIndex(ClienteDataModel.EMAIL)));
                cliente.setTelefone(cursor.getString(cursor.getColumnIndex(ClienteDataModel.TELEPHONE)));
                cliente.setSexo(cursor.getString(cursor.getColumnIndex(ClienteDataModel.SEX)));
                cliente.setIdade(cursor.getInt(cursor.getColumnIndex(ClienteDataModel.AGE)));

                clientes.add(cliente);
            }while(cursor.moveToNext());
        }
        return clientes;
    }
}
