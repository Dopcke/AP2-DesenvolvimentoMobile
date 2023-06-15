package com.example.ap2_desenvolvimentomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)

        val enviarButton: Button = findViewById(R.id.enviarButton)
        val opiniaoEditText: EditText = findViewById(R.id.opiniaoEditText)

        val opcaoSelecionada = intent.getStringExtra("opcaoSelecionada")
        val nome = intent.getStringExtra("nome")
        val rating = intent.getFloatExtra("nota", 0f)

        val textoOpiniao = if (opcaoSelecionada == "Filme") {
            "Escreva suas opiniões sobre o filme:"
        } else {
            "Escreva suas opiniões sobre a série:"
        }

        val textViewOpiniao: TextView = findViewById(R.id.textViewOpiniao)
        textViewOpiniao.text = textoOpiniao

        enviarButton.setOnClickListener {
            val opiniao = opiniaoEditText.text.toString()

            val intent = Intent(this, Activity6::class.java)
            intent.putExtra("nome", nome)
            intent.putExtra("nota", rating)
            startActivity(intent)
        }
    }
}
