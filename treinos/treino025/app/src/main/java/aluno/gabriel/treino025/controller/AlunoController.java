package aluno.gabriel.treino025.controller;

import android.content.Context;

import java.util.List;

import aluno.gabriel.treino025.database.AppDataBase;
import aluno.gabriel.treino025.model.Aluno;

public class AlunoController extends AppDataBase implements AppInterface<Aluno>{

    public AlunoController(Context context) {
        super(context);
    }

    @Override
    public Boolean incluir(Aluno obj) {
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
