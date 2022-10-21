package aluno.gabriel.treino023.api
import aluno.gabriel.treino023.BuildConfig
import kotlin.jvm.JvmStatic as JvmStatic1

class AppUtil {
    companion object{
        @kotlin.jvm.JvmStatic
        //API
        val TAG:String = "@Treino023"
        val VERSION: String = BuildConfig.VERSION_NAME

        //DATABASE CONFIG
        val DATABASE_NAME: String = "Treino023.sqlite"
        val DATABASE_VERSION: Int = 1

        //DATAMODEL CONFIG - Aluno
        val TABELA: String = "ALUNOS"
        val ID: String = "ID"
        val RGM: String = "RGM"
        val NOME: String = "NOME"
        val DTA_NASCIMENTO: String = "DTA_NASCIMENTO"
        val SEXO: String = "SEXO"
        val EMAIL: String = "EMAIL"
        val SENHA: String = "SENHA"
        var query: String = ""

        //
    }
}