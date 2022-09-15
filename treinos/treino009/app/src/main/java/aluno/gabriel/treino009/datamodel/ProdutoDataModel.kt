package aluno.gabriel.treino009.datamodel

import aluno.gabriel.treino009.core.ApplicationUtil

class ProdutoDataModel {
    companion object{ @JvmStatic
        fun queryCreateTable(): String {
        ApplicationUtil.query += "CREATE TABLE IF NOT EXISTS "+ApplicationUtil.TABLE_NAME+" ( "
        ApplicationUtil.query += ApplicationUtil.ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
        ApplicationUtil.query += ApplicationUtil.NOME+" TEXT NOT NULL, "
        ApplicationUtil.query += ApplicationUtil.FABRICANTE+" TEXT NOT NULL, "
        ApplicationUtil.query += ApplicationUtil.QUANTIDADE+" INTEGER DEFAULT 0, "
        ApplicationUtil.query += ApplicationUtil.PRECO+" REAL DEFAULT 0.00 "
        ApplicationUtil.query += " ) "
        return ApplicationUtil.query
        }


    }
}