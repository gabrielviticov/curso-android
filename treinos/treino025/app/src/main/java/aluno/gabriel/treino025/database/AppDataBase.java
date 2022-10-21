package aluno.gabriel.treino025.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import aluno.gabriel.treino025.core.AppReferences;

public class AppDataBase extends SQLiteOpenHelper {
    public AppDataBase(Context context) {
        super(context, AppReferences.DATABASE_NAME, null, AppReferences.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
