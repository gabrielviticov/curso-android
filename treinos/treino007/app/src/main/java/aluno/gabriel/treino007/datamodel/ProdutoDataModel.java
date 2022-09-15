package aluno.gabriel.treino007.datamodel;

public class ProdutoDataModel {
    public static final String TABELA = "PRODUTO";
    public static final String ID = "ID";
    public static final String NOME = "NOME";
    public static final String FABRICANTE = "FABRICANTE";
    public static final String PRICE = "PRECO";
    public static final String DISPONIVEL = "DISPONIVEL";
    public static String query = "";

    public static String getQueryCreateTable(){
        query += "CREATE TABLE IF NOT EXISTS "+TABELA+" ( ";
        query += ID+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        query += NOME+" TEXT NOT NULL, ";
        query += FABRICANTE+" TEXT NOT NULL, ";
        query += PRICE+" DECIMAL(6,2), ";
        query += DISPONIVEL+" BOOLEAN ";
        query += " ) ";
        return query;
    }

}
