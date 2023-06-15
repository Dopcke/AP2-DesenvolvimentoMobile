package com.example.ap2_desenvolvimentomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity3 : AppCompatActivity() {

    private lateinit var opcaoSelecionada: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        opcaoSelecionada = intent.getStringExtra("opcaoSelecionada") ?: ""

        val continuarButton: Button = findViewById(R.id.continuarButton)
        val nomeEditText: EditText = findViewById(R.id.nomeEditText)

        val perguntaText = if (opcaoSelecionada == "Filme") {
            "Digite o nome do filme:"
        } else {
            "Digite o nome da série:"
        }

        nomeEditText.hint = perguntaText

        continuarButton.setOnClickListener {
            val nome = nomeEditText.text.toString()

            val intent = Intent(this, Activity4::class.java)
            intent.putExtra("opcaoSelecionada", opcaoSelecionada)
            intent.putExtra("nome", nome)
            startActivity(intent)
        }
    }
}
