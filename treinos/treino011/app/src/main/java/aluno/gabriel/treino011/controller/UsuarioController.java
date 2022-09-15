package aluno.gabriel.treino011.controller;

import android.content.ContentValues;
import android.content.Context;

import aluno.gabriel.treino011.datamodel.UsuarioDataModel;
import aluno.gabriel.treino011.datasource.AppDataBase;
import aluno.gabriel.treino011.model.Usuario;

public class UsuarioController extends AppDataBase implements ICrud<Usuario>{
    ContentValues contentValues;

    public UsuarioController(Context context) {
        super(context);
    }

    @Override
    public Boolean inserir(Usuario obj) {
        contentValues = new ContentValues();
        contentValues.put(UsuarioDataModel.Companion.getNAME(), obj.getNome());
        contentValues.put(UsuarioDataModel.Companion.getEMAIL(), obj.getEmail());
        contentValues.put(UsuarioDataModel.Companion.getPASSWORD(), obj.getSenha());
        return incluir(UsuarioDataModel.Companion.getTABELA(), contentValues);
    }

    @Override
    public Boolean deletar(Integer id) {
        return desfazer(UsuarioDataModel.Companion.getTABELA(), id);
    }
}
