package aluno.gabriel.treino027.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import aluno.gabriel.treino027.core.AppUtil;
import aluno.gabriel.treino027.datamodel.AlunosDataModel;
import aluno.gabriel.treino027.datamodel.DisciplinaDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;

    public AppDataBase(Context context) {
        super(context, AppUtil.Companion.getDATABASE_NAME(), null, AppUtil.Companion.getDATABASE_VERSION());

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(AlunosDataModel.Companion.queryCreateTable());
            Log.i(AppUtil.Companion.getTAG(), "onCreate: "+AlunosDataModel.Companion.queryCreateTable());

            sqLiteDatabase.execSQL(DisciplinaDataModel.Companion.queryCreateTable());
            Log.i(AppUtil.Companion.getTAG(), "onCreate: "+DisciplinaDataModel.Companion.queryCreateTable());

            sqLiteDatabase.rawQuery("PRAGMA TABLE_INFO(["+AppUtil.Companion.getTABELA()+"])", null);
            Log.i(AppUtil.Companion.getTAG(), "onCreate: "+sqLiteDatabase.rawQuery("PRAGMA TABLE_INFO(["+AppUtil.Companion.getTABELA()+"])", null));
        }catch(SQLException e){
            Log.e(AppUtil.Companion.getTAG(), "onCreate: "+e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
