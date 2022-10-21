package aluno.gabriel.treino025.controller;

import java.util.List;

public interface AppInterface<T>{
    public abstract Boolean incluir(T obj);
    public abstract Boolean deletar(Integer id);
    public abstract Boolean alterar(T obj);
    public abstract List<T> listar();
}
