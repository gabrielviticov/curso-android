package aluno.gabriel.treino010.datamodel

import aluno.gabriel.treino010.core.AppUtil

class UsuarioDatamodel {
    companion object {
        fun queryCreateTable(): String {
            AppUtil.query += "CREATE TABLE IF NOT EXISTS " + AppUtil.databaseTable + " ( "
            AppUtil.query += AppUtil.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            AppUtil.query += AppUtil.NOME + " TEXT NOT NULL, "
            AppUtil.query += AppUtil.EMAIL + " TEXT NOT NULL UNIQUE, "
            AppUtil.query += AppUtil.SENHA + " TEXT NOT NULL "
            AppUtil.query += " ) "
            return AppUtil.query
        }
    }
}