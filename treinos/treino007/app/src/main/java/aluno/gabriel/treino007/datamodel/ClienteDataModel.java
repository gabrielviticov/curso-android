package aluno.gabriel.treino007.datamodel;

public class ClienteDataModel {
    public static final String TABELA = "CLIENTE";
    public static final String ID = "ID";
    public static final String NAME = "NOME";
    public static final String EMAIL = "EMAIL";
    public static final String SEX = "SEXO";
    public static String query = "";

    public static String getQueryCreateTable(){
        query += "CREATE TABLE IF NOT EXISTS "+TABELA+" ( ";
        query += ID+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        query += NAME+" TEXT NOT NULL, ";
        query += EMAIL+" TEXT NOT NULL UNIQUE, ";
        query += SEX+" TEXT NOT NULL ";
        query += " ) ";
        return query;
    }
}
