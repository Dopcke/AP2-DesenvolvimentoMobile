package com.example.ap2_desenvolvimentomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class Activity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val continuarButton: Button = findViewById(R.id.continuarButton)
        val ratingBar: RatingBar = findViewById(R.id.ratingBar)
        val perguntaTextView: TextView = findViewById(R.id.perguntaTextView)

        val opcaoSelecionada = intent.getStringExtra("opcaoSelecionada")
        val nome = intent.getStringExtra("nome")

        if (opcaoSelecionada == "Filme") {
            perguntaTextView.text = "Dê uma nota para o filme:"
        } else if (opcaoSelecionada == "Série") {
            perguntaTextView.text = "Dê uma nota para a série:"
        }

        continuarButton.setOnClickListener {
            val rating = ratingBar.rating

            val intent = Intent(this, Activity5::class.java)
            intent.putExtra("opcaoSelecionada", opcaoSelecionada)
            intent.putExtra("nome", nome)
            intent.putExtra("nota", rating)
            startActivity(intent)
        }
    }
}
