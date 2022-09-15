package aluno.gabriel.treino006.controller;

import java.util.List;

public interface ICrud<T>{
    public abstract boolean inserir(T obj);
    public abstract boolean alterar(T obj);
    public abstract boolean deletar(T obj);
    public abstract List<T> listar();
}
