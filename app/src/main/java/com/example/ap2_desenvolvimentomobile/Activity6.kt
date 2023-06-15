package com.example.ap2_desenvolvimentomobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6)

        val nome = intent.getStringExtra("nome")
        val nota = intent.getFloatExtra("nota", 0f)

        val agradecimentoTextView: TextView = findViewById(R.id.agradecimentoTextView)
        val detalhesTextView: TextView = findViewById(R.id.detalhesTextView)
        val recomendacaoTextView: TextView = findViewById(R.id.recomendacaoTextView)
        val cliqueAquiButton: Button = findViewById(R.id.cliqueAquiButton)
        val voltarButton: Button = findViewById(R.id.voltarButton)

        agradecimentoTextView.text = "Obrigado pela avaliação!"
        detalhesTextView.text = "Nome: $nome \nNota: $nota estrela(s)"

        recomendacaoTextView.text = "Caso esteja procurando por algo novo para assistir, cheque os filmes em cartaz no cinema mais próximo a você:"

        cliqueAquiButton.setOnClickListener {
            val url = "https://www.kinoplex.com.br/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        voltarButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            finish()
        }
    }
}
