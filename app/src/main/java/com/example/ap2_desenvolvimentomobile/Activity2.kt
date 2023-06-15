package com.example.ap2_desenvolvimentomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val continuarButton: Button = findViewById(R.id.continuarButton)
        val opcoesRadioGroup: RadioGroup = findViewById(R.id.opcoesRadioGroup)

        continuarButton.setOnClickListener {
            val radioButtonId = opcoesRadioGroup.checkedRadioButtonId
            if (radioButtonId != -1) {
                val radioButton: RadioButton = findViewById(radioButtonId)
                val opcaoSelecionada = radioButton.text.toString()

                val intent = Intent(this, Activity3::class.java)
                intent.putExtra("opcaoSelecionada", opcaoSelecionada)
                startActivity(intent)
            }
        }
    }
}