package aluno.gabriel.treino026.controller;

import java.util.List;

public interface AppInterface<T>{
    public abstract Boolean incluir(T obj);
    public abstract Boolean alterar(T obj);
    public abstract Boolean deletar(Integer id);
    public abstract List<T> listar();
}
