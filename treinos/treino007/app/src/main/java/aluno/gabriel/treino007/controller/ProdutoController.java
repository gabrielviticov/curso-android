package aluno.gabriel.treino007.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

import aluno.gabriel.treino007.datamodel.ProdutoDataModel;
import aluno.gabriel.treino007.datasource.ApplicationDatabase;
import aluno.gabriel.treino007.model.Produto;

public class ProdutoController extends ApplicationDatabase implements ICrud<Produto>{
    ContentValues contentValues;
    public ProdutoController(Context context) {
        super(context);
    }


    @Override
    public boolean incluir(Produto obj) {
        contentValues = new ContentValues();
        contentValues.put(ProdutoDataModel.NOME, obj.getNome());
        contentValues.put(ProdutoDataModel.FABRICANTE, obj.getFabricante());
        contentValues.put(ProdutoDataModel.PRICE, obj.getPreco());
        contentValues.put(ProdutoDataModel.DISPONIVEL, obj.getDisponivel());
        return inserir(ProdutoDataModel.TABELA, contentValues);
    }

    @Override
    public boolean deletar(Produto obj) {
        return false;
    }

    @Override
    public boolean alterar(Produto obj) {
        return false;
    }

    @Override
    public List<Produto> listar() {
        return null;
    }
}
