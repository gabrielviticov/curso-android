package aluno.gabriel.appminhaideiadb.datamodel;

public class ClienteDataModel {

    public static final String DB_TABLE = "CLIENTE";
    public static final String ID = "id";
    public static final String NAME = "nome";
    public static final String EMAIL = "email";
    public static final String TELEPHONE = "telefone";
    public static final String SEX = "sexo";
    public static final String AGE = "idade";
    public static String query = "";

    public static String createTableQuery(){
        query += "CREATE TABLE IF NOT EXISTS "+DB_TABLE+" ( ";
        query += ID+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        query += NAME+" TEXT NOT NULL, ";
        query += EMAIL+" TEXT NOT NULL UNIQUE, ";
        query += TELEPHONE+" TEXT NOT NULL, ";
        query += SEX+" TEXT NOT NULL, ";
        query += AGE+" INTEGER UNSIGNED ";
        query += " ) ";

        return query;
    }
}
