package aluno.gabriel.treino008.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

import aluno.gabriel.treino008.core.ApplicationUtil;
import aluno.gabriel.treino008.database.ApplicationDatabase;
import aluno.gabriel.treino008.datamodel.UsuarioDatamodel;
import aluno.gabriel.treino008.model.Usuario;

public class UsuarioController extends ApplicationDatabase implements ICrud<Usuario>{

    ContentValues contentValues;

    public UsuarioController(Context context) {
        super(context);
    }

    @Override
    public Boolean inserir(Usuario obj) {
        contentValues = new ContentValues();
        contentValues.put(ApplicationUtil.NOME, obj.getNome());
        contentValues.put(ApplicationUtil.EMAIL, obj.getEmail());
        contentValues.put(ApplicationUtil.SENHA, obj.getSenha());
        return queryInsert(ApplicationUtil.TABELA, contentValues);
    }

    @Override
    public Boolean alterar(Usuario obj) {
        return null;
    }

    @Override
    public Boolean deletar(Integer id) {
        return queryDeleteByID(ApplicationUtil.TABELA, id);
    }

    @Override
    public List<Usuario> listar() {
        return null;
    }
}
