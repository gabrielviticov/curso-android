package aluno.gabriel.treino016.datamodel;

public class UsuarioDataModel {
    public static final String TABELA = "USUARIOS";
    public static final String ID = "ID";
    public static final String NOME = "NOME";
    public static final String EMAIL = "EMAIL";
    public static final String SENHA = "SENHA";
    public static String query = "";

    public static String queryCreateTable(){
        query += "CREATE TABLE IF NOT EXISTS "+TABELA+" ( ";
        query += ID+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        query += NOME+" TEXT NOT NULL, ";
        query += EMAIL+" TEXT NOT NULL UNIQUE, ";
        query += SENHA+" TEXT NOT NULL ";
        query += " ) ";
        return query;
    }
}
