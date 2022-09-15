package aluno.gabriel.treino010.datasource;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import aluno.gabriel.treino010.core.AppUtil;
import aluno.gabriel.treino010.datamodel.UsuarioDatamodel;

public class AppDatabase extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;
    public AppDatabase(Context context) {
        super(context, AppUtil.Companion.getDatabaseName(), null, AppUtil.Companion.getDatabaseVersion());

        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(UsuarioDatamodel.Companion.queryCreateTable());
            Log.i(AppUtil.getTAG(), "onCreate: "+UsuarioDatamodel.Companion.queryCreateTable());
        }catch(SQLException e){
            Log.e(AppUtil.getTAG(), "onCreate: "+e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
