package aluno.gabriel.treino006.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import aluno.gabriel.treino006.core.ApplicationUtil;
import aluno.gabriel.treino006.datamodel.UsuarioDataModel;
import aluno.gabriel.treino006.datasource.ApplicationDataBase;
import aluno.gabriel.treino006.model.Usuario;

public class UsuarioController extends ApplicationDataBase implements ICrud<Usuario> {
    ContentValues values;

    public UsuarioController(Context context) {
        super(context);

        Log.i(ApplicationUtil.TAG, "UsuarioController: conectando a classe ao banco de dados...");
    }

    @Override
    public boolean inserir(Usuario obj) {
        values = new ContentValues();
        values.put(UsuarioDataModel.NAME, obj.getNome());
        values.put(UsuarioDataModel.EMAIL, obj.getEmail());
        values.put(UsuarioDataModel.PASSWORD, obj.getSenha());
        return queryInsertInto(UsuarioDataModel.DB_TABLE, values);
    }

    @Override
    public boolean alterar(Usuario obj) {
        values = new ContentValues();
        values.put(UsuarioDataModel.ID, obj.getId());
        values.put(UsuarioDataModel.NAME, obj.getNome());
        values.put(UsuarioDataModel.EMAIL, obj.getEmail());
        values.put(UsuarioDataModel.PASSWORD, obj.getSenha());
        return false;
    }

    @Override
    public boolean deletar(Usuario obj) {
        values = new ContentValues();
        values.put(UsuarioDataModel.ID, obj.getId());
        return false;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> list = new ArrayList<>();
        return list;
    }
}
