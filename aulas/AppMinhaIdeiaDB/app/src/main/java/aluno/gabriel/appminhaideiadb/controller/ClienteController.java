package aluno.gabriel.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import aluno.gabriel.appminhaideiadb.api.ApplicationUtil;
import aluno.gabriel.appminhaideiadb.datamodel.ClienteDataModel;
import aluno.gabriel.appminhaideiadb.datasource.ApplicationDataSource;
import aluno.gabriel.appminhaideiadb.model.Cliente;

public class ClienteController extends ApplicationDataSource implements ICrud<Cliente>{

    ContentValues contentValues;
    public ClienteController(Context context) {
        super(context);

        Log.i(ApplicationUtil.TAG, "ClienteController: conectado ao Banco de Dados. ");
    }

    @Override
    public boolean inserir(Cliente obj) {
        contentValues = new ContentValues();
        //Key e Value
        //contentValues.put(ClienteDataModel.ID, obj.getId());
        contentValues.put(ClienteDataModel.NAME, obj.getNome());
        contentValues.put(ClienteDataModel.EMAIL, obj.getEmail());
        contentValues.put(ClienteDataModel.TELEPHONE, obj.getTelefone());
        contentValues.put(ClienteDataModel.SEX, obj.getSexo());
        contentValues.put(ClienteDataModel.AGE, obj.getIdade());

        return queryInsert(ClienteDataModel.DB_TABLE, contentValues);
    }

    @Override
    public boolean alterar(Cliente obj) {
        contentValues = new ContentValues();
        contentValues.put(ClienteDataModel.ID, obj.getId());
        contentValues.put(ClienteDataModel.NAME, obj.getNome());
        contentValues.put(ClienteDataModel.EMAIL, obj.getEmail());
        contentValues.put(ClienteDataModel.TELEPHONE, obj.getTelefone());
        contentValues.put(ClienteDataModel.SEX, obj.getSexo());
        contentValues.put(ClienteDataModel.AGE, obj.getIdade());

        return queryUpdateByID(ClienteDataModel.DB_TABLE, contentValues);
    }

    @Override
    public boolean deletar(Integer id) {

        return queryDeleteByID(ClienteDataModel.DB_TABLE, id);
    }

    @Override
    public List<Cliente> listar() {
        /*
        List<Cliente> list = new ArrayList<>();
        list.add(new Cliente());
        list.add(new Cliente());
        list.add(new Cliente());

        Cliente novo = new Cliente("Gabriel Souza", "gabrielsouza22@aluno.edu.br", "(11) 27266603", 20, "Masculino");

        list.add(novo);
        Integer totClientes = list.size();
        */
        return getAllClientes(ClienteDataModel.DB_TABLE);
    }
}
