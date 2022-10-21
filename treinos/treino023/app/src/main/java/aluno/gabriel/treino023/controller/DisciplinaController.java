package aluno.gabriel.treino023.controller;

import android.content.Context;

import java.util.List;

import aluno.gabriel.treino023.applicationInterface.Interface;
import aluno.gabriel.treino023.datasource.AppDataBase;
import aluno.gabriel.treino023.model.Disciplina;

public class DisciplinaController extends AppDataBase implements Interface<Disciplina> {
    public DisciplinaController(Context context) {
        super(context);
    }

    @Override
    public Boolean inserir(Disciplina obj) {
        return null;
    }

    @Override
    public Boolean deletar(Integer id) {
        return null;
    }

    @Override
    public Boolean alterar(Disciplina obj) {
        return null;
    }

    @Override
    public List<Disciplina> listar() {
        return null;
    }
}
