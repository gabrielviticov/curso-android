package aluno.gabriel.treino023.applicationInterface;

import java.util.List;

public interface Interface<T>{
    Boolean inserir(T obj);
    Boolean deletar(Integer id);
    Boolean alterar(T obj);
    List<T> listar();
}
