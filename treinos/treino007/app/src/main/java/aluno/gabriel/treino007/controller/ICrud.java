package aluno.gabriel.treino007.controller;

import java.util.List;

public interface ICrud<T> {
    public abstract boolean incluir(T obj);
    public abstract boolean deletar(T obj);
    public abstract boolean alterar(T obj);
    public abstract List<T> listar();
}
