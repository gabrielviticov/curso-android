package aluno.gabriel.treino010.core

class AppUtil() {


    companion object {
       @JvmStatic
       // App Datas
       val TAG: String = "@treino010"
       val databaseName: String = "Treino010.sqlite"
       val databaseVersion: Int = 1

       // Usuario Class Columns
       val ID: String = "ID"
       val NOME: String = "NOME"
       val EMAIL: String = "EMAIL"
       val SENHA: String = "SENHA"

       //Usuario access Class Model
       var databaseTable: String = "USUARIOS"
       var query: String = ""
    }
}