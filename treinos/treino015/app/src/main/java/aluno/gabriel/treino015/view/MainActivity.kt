package aluno.gabriel.treino015.view

import aluno.gabriel.treino015.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtLogin: TextView = findViewById<TextView>(R.id.txtLogin)
        val editEmail: EditText = findViewById(R.id.editEmail)
        val editSenha: EditText = findViewById(R.id.editSenha)
        val btnLogin: Button = findViewById(R.id.btnLogin)

        txtLogin.setText("LOGIN")

        btnLogin.setOnClickListener(){
            if(TextUtils.isEmpty(editEmail.text.toString()) && TextUtils.isEmpty(editSenha.text.toString())){
                editEmail.setError("*")
                editSenha.setError("*")
            } else if(TextUtils.isEmpty(editEmail.text.toString())){
                editEmail.setError("*")
            } else if(TextUtils.isEmpty(editSenha.text.toString())){
                editSenha.setError("*")
            } else {
                Toast.makeText(applicationContext, "Email: "+editEmail.text+"\nSenha: "+editSenha.text.toString()).show()
            }
        }

    }


}