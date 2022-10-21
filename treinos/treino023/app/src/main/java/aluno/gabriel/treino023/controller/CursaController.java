package aluno.gabriel.treino023.controller;

import android.content.Context;

import java.util.List;

import aluno.gabriel.treino023.applicationInterface.Interface;
import aluno.gabriel.treino023.datasource.AppDataBase;
import aluno.gabriel.treino023.model.Cursa;

public class CursaController extends AppDataBase implements Interface<Cursa> {
    public CursaController(Context context) {
        super(context);
    }

    @Override
    public Boolean inserir(Cursa obj) {
        return null;
    }

    @Override
    public Boolean deletar(Integer id) {
        return null;
    }

    @Override
    public Boolean alterar(Cursa obj) {
        return null;
    }

    @Override
    public List<Cursa> listar() {
        return null;
    }
}
