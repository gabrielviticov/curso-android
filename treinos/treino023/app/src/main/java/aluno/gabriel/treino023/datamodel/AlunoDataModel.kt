package aluno.gabriel.treino023.datamodel

import aluno.gabriel.treino023.api.AppUtil


class AlunoDataModel {
    companion object{
        fun queryCreateTable(): String {
            AppUtil.Companion.query += "CREATE TABLE IF NOT EXISTS "+AppUtil.Companion.TABELA+" ( "
            AppUtil.Companion.query += AppUtil.Companion.ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            AppUtil.Companion.query += AppUtil.Companion.RGM+" TEXT NOT NULL UNIQUE, "
            AppUtil.Companion.query += AppUtil.Companion.NOME+" TEXT NOT NULL, "
            AppUtil.Companion.query += AppUtil.Companion.DTA_NASCIMENTO+" TEXT NOT NULL, "
            AppUtil.Companion.query += AppUtil.Companion.SEXO+" TEXT CHECK( "+AppUtil.Companion.SEXO+" IN ('M', 'F')) DEFAULT = 'M',  "
            AppUtil.Companion.query += AppUtil.Companion.EMAIL+" TEXT UNIQUE NOT NULL, "
            AppUtil.Companion.query += AppUtil.Companion.SENHA+" INTEGER NOT NULL DEFAULT = '31697'"
            AppUtil.Companion.query += " ) "

            return AppUtil.Companion.query
        }
    }
}