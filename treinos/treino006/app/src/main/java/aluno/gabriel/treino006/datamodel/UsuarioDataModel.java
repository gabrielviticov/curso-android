package aluno.gabriel.treino006.datamodel;

public class UsuarioDataModel {
    public static final String DB_TABLE = "USUARIOS";
    public static final String ID = "ID";
    public static final String NAME = "NOME";
    public static final String EMAIL = "EMAIL";
    public static final String PASSWORD = "SENHA";
    public static String query = "";

    public static String queryCreateTable(){
        query += "CREATE TABLE IF NOT EXISTS "+DB_TABLE+" ( ";
        query += ID+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        query += NAME+" TEXT NOT NULL, ";
        query += EMAIL+" TEXT NOT NULL UNIQUE, ";
        query += PASSWORD+" TEXT NOT NULL UNIQUE ";
        query += " ) ";
        return query;
    }
}
