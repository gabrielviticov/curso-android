package aluno.gabriel.treino027.core

import aluno.gabriel.treino027.BuildConfig

class AppUtil {
    companion object{


        //APPLICATION CONFIGS
        val TAG: String = "@treino027"
        val APPLICATION_VERSION = BuildConfig.VERSION_NAME
        val APPLICATION_NAME = "Aluno Check-In"

        //Database configure
        val DATABASE_NAME: String = "@treino027.sqlite"
        val DATABASE_VERSION: Int = 1

        //Campos de Alunos
        val TABELA: String = "ALUNOS"
        val ID: String = "ID"
        val REGISTRO_ALUNO: String = "REGISTRO_ALUNO"
        val NOME_COMPLETO: String = "NOME_COMPLETO"
        val CPF: String = "CPF"
        val SEXO: String = "SEXO"
        val DTA_NASCIMENTO: String = "DTA_NASCIMENTO"
        val EMAIL: String = "EMAIL"
        val TELEFONE: String = "TELEFONE"
        val SENHA: String = "SENHA"

        //ACESSO GLOBAL
        var query_alunos: String = ""
        var query_disciplinas: String = ""
        var query_cursa: String = ""
        var sql_inject: String = ""

        //Campos de Cursa
        val TABELA_CURSA: String = "CURSA"
        val ID_CURSA: String = "ID"
        val GRADUACAO: String = "GRADUACAO"
        val SEMESTRE_TURMA: String = "SEMESTRE_TURMA"
        val ID_ALUNO: String = "ID_ALUNO"
        val ID_DISCIPLINA_CURSA: String = "ID_DISCIPLINA"
        val CONSTRAINT_FK_CURSA_ALUNO = "CONSTRAINT FK_ALUNOS FOREIGN KEY (" + ID_ALUNO+ ") REFERENCES "+TABELA+"("+ID_ALUNO+")"
        //val CONSTRAINT_FK_CURSA_DISCIPLINA = "CONSTRAINT FK_DISCIPLINA FOREIGN KEY ("+ ID_DISCIPLINA+ ") REFERENCES "+TABELA_DISCIPLINA+" ("



        //Campos de Disciplina
        val TABELA_DISCIPLINA: String = "DISCIPLINAS"
        val ID_DISCIPLINA: String = "ID"
        val REGISTRO_DISCIPLINA: String = "REGISTRO_DISCIPLINA"
        val NOME_DISCIPLINA: String = "NOME_DISCIPLINA"
        val CARGA_HORARIA: String = "CARGA_HORARIA"

    }
}