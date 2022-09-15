package aluno.gabriel.treino008.datamodel;

import aluno.gabriel.treino008.core.ApplicationUtil;

public class UsuarioDatamodel {
    public static String queryCreateTable(){
        ApplicationUtil.query += "CREATE TABLE IF NOT EXISTS "+ApplicationUtil.TABELA+" ( ";
        ApplicationUtil.query += ApplicationUtil.ID+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        ApplicationUtil.query += ApplicationUtil.NOME+" TEXT NOT NULL, ";
        ApplicationUtil.query += ApplicationUtil.EMAIL+" TEXT NOT NULL UNIQUE, ";
        ApplicationUtil.query += ApplicationUtil.SENHA+" TEXT NOT NULL ";
        ApplicationUtil.query += " ) ";
        return ApplicationUtil.query;
    }
}
