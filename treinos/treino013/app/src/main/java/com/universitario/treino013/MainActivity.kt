package com.universitario.treino013

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

        val txtLogin: TextView = findViewById(R.id.txtLogin)
        txtLogin.text = "Login"
        txtLogin.textSize = 24.00f

        val editEmail: EditText = findViewById(R.id.editEmail)
        editEmail.hint = "Informe seu Email"
        val editSenha: EditText = findViewById(R.id.editSenha)
        editSenha.hint = "Informe sua Senha"
        val btnLogar: Button = findViewById(R.id.btnLogar)
        btnLogar.text = "Conectar"

        btnLogar.setOnClickListener(){
            if(TextUtils.isEmpty(editEmail.text.toString()) && TextUtils.isEmpty(editSenha.text.toString())){
                editEmail.error = "*"
                editSenha.error = "*"
                Toast.makeText(applicationContext, "Por favor, informe seu email e sua senha!", Toast.LENGTH_LONG).show()
            } else if(TextUtils.isEmpty(editEmail.text.toString())){
                editEmail.error = "*"
                Toast.makeText(applicationContext, "Por favor, informe seu email!", Toast.LENGTH_LONG).show()
            } else if(TextUtils.isEmpty(editSenha.text.toString())){
                editSenha.error = "*"
                Toast.makeText(applicationContext, "Por favor, informe sua senha!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Seu email é: ${editEmail.text} e a sua senha é: ${editSenha.text}", Toast.LENGTH_LONG).show()
            }
        }
    }
}