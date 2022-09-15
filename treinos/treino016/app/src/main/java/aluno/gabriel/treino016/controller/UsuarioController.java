package aluno.gabriel.treino016.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

import aluno.gabriel.treino016.datamodel.UsuarioDataModel;
import aluno.gabriel.treino016.datasource.AppDataBase;
import aluno.gabriel.treino016.model.Usuario;

public class UsuarioController extends AppDataBase implements AppCrud<Usuario>{
    ContentValues contentValues;
    public UsuarioController(Context context) {
        super(context);
    }

    @Override
    public Boolean inserir(Usuario obj) {
        contentValues = new ContentValues();
        contentValues.put(UsuarioDataModel.ID, obj.getId());
        contentValues.put(UsuarioDataModel.NOME, obj.getNome());
        contentValues.put(UsuarioDataModel.EMAIL, obj.getEmail());
        contentValues.put(UsuarioDataModel.SENHA, obj.getSenha());
        return queryInsertInto(UsuarioDataModel.TABELA, contentValues);
    }

    @Override
    public Boolean alterar(Usuario obj) {
        contentValues = new ContentValues();
        contentValues.put(UsuarioDataModel.NOME, obj.getNome());
        return queryUpdateByValues(UsuarioDataModel.TABELA, contentValues);
    }

    @Override
    public Boolean deletar(Integer id) {
        return queryDeleteByID(UsuarioDataModel.TABELA, id);
    }

    @Override
    public List<Usuario> listar() {
        return null;
    }
}
