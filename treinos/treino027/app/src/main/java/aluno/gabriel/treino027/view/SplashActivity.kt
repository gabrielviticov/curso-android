package aluno.gabriel.treino027.view

import aluno.gabriel.treino027.R
import aluno.gabriel.treino027.core.AppUtil
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

        trocarTela()
        getApplicationInformations()
    }

    fun trocarTela(){
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            finish()
        },1000)
    }

    fun getApplicationInformations(){
        val txtVersaoApp: TextView = findViewById(R.id.txtVersaoApp)
        val txtNomeApp: TextView = findViewById(R.id.txtNomeApp)

        txtNomeApp.text = ""+AppUtil.Companion.APPLICATION_NAME
        txtVersaoApp.text = "Versão: "+ AppUtil.Companion.APPLICATION_VERSION

    }
}