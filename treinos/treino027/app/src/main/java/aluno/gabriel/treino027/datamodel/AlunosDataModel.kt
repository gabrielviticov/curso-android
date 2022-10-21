package aluno.gabriel.treino027.datamodel

import aluno.gabriel.treino027.core.AppUtil

class AlunosDataModel {
    companion object {
        fun queryCreateTable(): String {
            AppUtil.query_alunos += "CREATE TABLE IF NOT EXISTS " + AppUtil.TABELA + " ( "
            AppUtil.query_alunos += AppUtil.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            AppUtil.query_alunos += AppUtil.REGISTRO_ALUNO + " TEXT NOT NULL UNIQUE, "
            AppUtil.query_alunos += AppUtil.NOME_COMPLETO + " TEXT NOT NULL, "
            AppUtil.query_alunos += AppUtil.CPF + " INTEGER NOT NULL UNIQUE, "
            AppUtil.query_alunos += AppUtil.SEXO + " TEXT CHECK ( " + AppUtil.SEXO + " IN ('M', 'F')), "
            AppUtil.query_alunos += AppUtil.DTA_NASCIMENTO + " TEXT NOT NULL, "
            AppUtil.query_alunos += AppUtil.EMAIL + " TEXT NOT NULL UNIQUE, "
            AppUtil.query_alunos += AppUtil.TELEFONE + " INTEGER, "
            AppUtil.query_alunos += AppUtil.SENHA + " TEXT NOT NULL "
            AppUtil.query_alunos += " ) "
            

            return AppUtil.query_alunos
        }

        fun queryDescribeTable(): String {
            AppUtil.sql_inject += "PRAGMA TABLE_INFO(["+AppUtil.TABELA+"])"
            return AppUtil.sql_inject
        }
    }
}