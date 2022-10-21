package aluno.gabriel.treino027.datamodel

import aluno.gabriel.treino027.core.AppUtil

class DisciplinaDataModel {
    companion object{
        fun queryCreateTable(): String{
            AppUtil.query_disciplinas += "CREATE TABLE IF NOT EXISTS "+AppUtil.TABELA_DISCIPLINA+" ( "
            AppUtil.query_disciplinas += AppUtil.ID_DISCIPLINA+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            AppUtil.query_disciplinas += AppUtil.REGISTRO_DISCIPLINA+" TEXT NOT NULL UNIQUE, "
            AppUtil.query_disciplinas += AppUtil.NOME_DISCIPLINA+" TEXT NOT NULL UNIQUE, "
            AppUtil.query_disciplinas += AppUtil.CARGA_HORARIA+" INTEGER DEFAULT 30 CHECK ("+AppUtil.CARGA_HORARIA+">=0) "
            AppUtil.query_disciplinas += " ) "
            return AppUtil.query_disciplinas
        }
    }
}