package aluno.gabriel.appminhaideiadb.datamodel;

public class ProdutoDataModel {
    public static final String DB_TABLE = "PRODUTO";
    public static final String ID = "id";
    public static final String NAME = "nome";
    public static final String FABRICANTE = "fabricante";
    public static String query = "";

    public static String queryCreateTable(){
        query += "CREATE TABLE IF NOT EXISTS "+DB_TABLE+" ( ";
        query += ID+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        query += NAME+" TEXT NOT NULL, ";
        query += FABRICANTE+" TEXT NOT NULL ";
        query += " ) ";
        return query;
    }
}
