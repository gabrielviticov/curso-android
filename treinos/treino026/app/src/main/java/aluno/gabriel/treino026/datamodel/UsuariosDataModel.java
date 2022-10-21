package aluno.gabriel.treino026.datamodel;

public class UsuariosDataModel {
    public static final String TABELA = "USUARIOS";
    public static final String ID = "ID";
    public static final String NOME = "NOME_COMPLETO";
    public static final String REGISTRO = "NUM_IDENTIFICACAO";
    public static final String EMAIL = "ENDERECO_EMAIL";
    public static final String SENHA = "SENHA";
    public static String query = "";

    public static String queryCreateTable(){
        query += "CREATE TABLE IF NOT EXISTS "+TABELA+" ( ";
        query += ID+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        query += NOME+" TEXT NOT NULL, ";
        query += REGISTRO+" INTEGER NOT NULL UNIQUE, ";
        query += EMAIL+" TEXT NOT NULL UNIQUE, ";
        query += SENHA+" TEXT NOT NULL ";
        query += " ) ";
        return query;
    }
}
