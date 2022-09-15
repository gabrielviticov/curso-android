package aluno.gabriel.treino009.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

import aluno.gabriel.treino009.core.ApplicationUtil;
import aluno.gabriel.treino009.database.ApplicationDataBase;
import aluno.gabriel.treino009.datamodel.ProdutoDataModel;
import aluno.gabriel.treino009.model.Produto;

public class ProdutoController extends ApplicationDataBase implements ICrud<Produto>{
    ContentValues contentValues;
    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public Boolean inserir(Produto obj) {
        contentValues = new ContentValues();
        contentValues.put(ApplicationUtil.NOME, obj.getNome());
        contentValues.put(ApplicationUtil.FABRICANTE, obj.getFabricante());
        contentValues.put(ApplicationUtil.QUANTIDADE, obj.getQuantidade());
        contentValues.put(ApplicationUtil.PRECO, obj.getPreco());
        return inserir(ApplicationUtil.TABLE_NAME, contentValues);
    }

    @Override
    public Boolean alterar(Produto obj) {
        return null;
    }

    @Override
    public Boolean deletar(Integer id) {
        return deletar(ApplicationUtil.TABLE_NAME, id);
    }

    @Override
    public List<Produto> listar() {
        return null;
    }
}
