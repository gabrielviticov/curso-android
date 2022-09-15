package aluno.gabriel.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import aluno.gabriel.appminhaideiadb.datamodel.ProdutoDataModel;
import aluno.gabriel.appminhaideiadb.datasource.ApplicationDataSource;
import aluno.gabriel.appminhaideiadb.model.Produto;

public class ProdutoController extends ApplicationDataSource implements ICrud<Produto>{
    ContentValues contentValues;

    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean inserir(Produto obj) {
        contentValues = new ContentValues();
        contentValues.put(ProdutoDataModel.NAME, obj.getNome());
        contentValues.put(ProdutoDataModel.FABRICANTE, obj.getFabricante());

        return queryInsert(ProdutoDataModel.DB_TABLE, contentValues);
    }

    @Override
    public boolean alterar(Produto obj) {
        contentValues = new ContentValues();
        contentValues.put(ProdutoDataModel.ID, obj.getId());
        contentValues.put(ProdutoDataModel.NAME, obj.getNome());
        contentValues.put(ProdutoDataModel.FABRICANTE, obj.getFabricante());
        return true;
    }

    @Override
    public boolean deletar(Integer id) {
        return queryDeleteByID(ProdutoDataModel.DB_TABLE, id);
    }

    @Override
    public List<Produto> listar() {
        List<Produto> list = new ArrayList<>();
        return list;
    }
}
