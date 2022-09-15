package aluno.gabriel.treino007.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

import aluno.gabriel.treino007.datamodel.ClienteDataModel;
import aluno.gabriel.treino007.datasource.ApplicationDatabase;
import aluno.gabriel.treino007.model.Cliente;

public class ClienteController extends ApplicationDatabase implements ICrud<Cliente>{
    ContentValues contentValues;

    public ClienteController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Cliente obj) {
        contentValues = new ContentValues();
        contentValues.put(ClienteDataModel.NAME, obj.getNome());
        contentValues.put(ClienteDataModel.EMAIL, obj.getEmail());
        contentValues.put(ClienteDataModel.SEX, obj.getSexo());
        return inserir(ClienteDataModel.TABELA, contentValues);
    }

    @Override
    public boolean deletar(Cliente obj) {
        return false;
    }

    @Override
    public boolean alterar(Cliente obj) {
        return false;
    }


    @Override
    public List<Cliente> listar() {
        return null;
    }
}
