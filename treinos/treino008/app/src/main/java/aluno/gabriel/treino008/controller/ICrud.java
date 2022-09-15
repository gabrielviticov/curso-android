package aluno.gabriel.treino008.controller;

import java.util.List;

public interface ICrud<T> {
    public abstract Boolean inserir(T obj);
    public abstract Boolean alterar(T obj);
    public abstract Boolean deletar(Integer id);
    public abstract List<T> listar();
}
