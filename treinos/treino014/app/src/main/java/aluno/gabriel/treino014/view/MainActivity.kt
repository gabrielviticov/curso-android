package aluno.gabriel.treino014.view

import aluno.gabriel.treino014.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtN1: TextView = findViewById(R.id.txtN1)
        val txtN2: TextView = findViewById(R.id.txtN2)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        var editN1: EditText = findViewById(R.id.editN1)
        var editN2: EditText = findViewById(R.id.editN2)

        var n1: Double = editN1
    }
}