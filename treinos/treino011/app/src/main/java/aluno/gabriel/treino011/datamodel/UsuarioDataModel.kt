package aluno.gabriel.treino011.datamodel

class UsuarioDataModel {
    companion object{
        val TABELA:String = "USUARIOS"
        val ID:String = "ID"
        val NAME:String = "NOME"
        val EMAIL: String = "EMAIL"
        val PASSWORD: String = "SENHA"
        var query: String = ""

    fun queryCreateTable(): String {
        query += "CREATE TABLE IF NOT EXISTS " + TABELA + " ( "
        query += ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
        query += NAME + " TEXT NOT NULL, "
        query += EMAIL + " TEXT NOT NULL UNIQUE, "
        query += PASSWORD + " TEXT NOT NULL "
        query += " ) "
        return query
        }

    }
}