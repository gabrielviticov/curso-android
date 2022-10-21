package aluno.gabriel.treino026.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

import aluno.gabriel.treino026.database.AppDataBase;
import aluno.gabriel.treino026.datamodel.UsuariosDataModel;
import aluno.gabriel.treino026.model.Usuarios;

public class UsuariosController extends AppDataBase implements AppInterface<Usuarios>{
    ContentValues contentValues;

    public UsuariosController(Context context) {
        super(context);
    }

    @Override
    public Boolean incluir(Usuarios obj) {
        contentValues = new ContentValues();

        contentValues.put(UsuariosDataModel.NOME, obj.getNomeCompleto());
        contentValues.put(UsuariosDataModel.REGISTRO, obj.getRegistro());
        contentValues.put(UsuariosDataModel.EMAIL, obj.getEmail());
        contentValues.put(UsuariosDataModel.SENHA, obj.getSenha());

        return inserir(UsuariosDataModel.TABELA, contentValues);
    }

    @Override
    public Boolean alterar(Usuarios obj) {
        return null;
    }

    @Override
    public Boolean deletar(Integer id) {
        return null;
    }

    @Override
    public List<Usuarios> listar() {
        return null;
    }
}
