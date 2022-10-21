package aluno.gabriel.treino023.datasource;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import aluno.gabriel.treino023.api.AppUtil;
import aluno.gabriel.treino023.datamodel.AlunoDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "TREINO023.sqlite";
    public static final Integer DATABASE_VERSION = 1;
    SQLiteDatabase sqLiteDatabase;

    public AppDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try{
            sqLiteDatabase.execSQL(AlunoDataModel.Companion.queryCreateTable());
            Log.i(AppUtil.getTAG(), "onCreate: "+AlunoDataModel.Companion.queryCreateTable());
        } catch(SQLException e){
            Log.e(AppUtil.getTAG(), "onCreate: "+e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
