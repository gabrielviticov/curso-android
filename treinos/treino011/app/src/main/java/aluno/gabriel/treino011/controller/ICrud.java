package aluno.gabriel.treino011.controller;

public interface ICrud<T>{
    public abstract Boolean inserir(T obj);
    public abstract Boolean deletar(Integer id);
}
