package aluno.gabriel.treino016.controller;

import java.util.List;

public interface AppCrud<T>{
    public abstract Boolean inserir(T obj);
    public abstract Boolean alterar(T obj);
    public abstract Boolean deletar(Integer id);
    public abstract List<T> listar();
}
