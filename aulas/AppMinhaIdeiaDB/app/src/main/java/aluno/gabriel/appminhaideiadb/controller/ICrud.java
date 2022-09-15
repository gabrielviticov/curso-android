package aluno.gabriel.appminhaideiadb.controller;

import java.util.List;

public interface ICrud<T> {
    public abstract boolean inserir(T obj);
    public abstract boolean alterar(T obj);
    public abstract boolean deletar(Integer id);
    public abstract List<T> listar();
}
