package aluno.gabriel.treino023.controller;

import android.content.Context;

import java.util.List;

import aluno.gabriel.treino023.applicationInterface.Interface;
import aluno.gabriel.treino023.datasource.AppDataBase;
import aluno.gabriel.treino023.model.Aluno;

public class AlunoController extends AppDataBase implements Interface<Aluno> {

    public AlunoController(Context context) {
        super(context);
    }

    @Override
    public Boolean inserir(Aluno obj) {
        return null;
    }

    @Override
    public Boolean deletar(Integer id) {
        return null;
    }

    @Override
    public Boolean alterar(Aluno obj) {
        return null;
    }

    @Override
    public List<Aluno> listar() {
        return null;
    }
}
