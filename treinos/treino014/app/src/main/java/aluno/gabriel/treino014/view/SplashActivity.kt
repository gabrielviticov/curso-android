package aluno.gabriel.treino014.view

import aluno.gabriel.treino014.R
import aluno.gabriel.treino014.core.AppUtil
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        editFields()
        trocarTela()
    }

    fun trocarTela(){
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        },10000)
    }

    fun editFields(){
        val txtNome: TextView = findViewById(R.id.txtNome)
        val txtVersion: TextView = findViewById(R.id.txtVersion)
        txtVersion.text = "Versão: "+AppUtil.APP_VERSION
    }
}