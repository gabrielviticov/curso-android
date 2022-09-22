package aluno.gabriel.treino018;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PessoaDao{
    @Query("select * from pessoa")
    public List<Pessoa> listar();

    @Insert
    public void inserir(Pessoa pessoa);

    @Delete
    public void remover(Pessoa pessoa);
}
