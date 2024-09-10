package com.atividadetopicos.appgeneratenumrandom

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import kotlin.random.Random
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            onButtonClick()
        }
        }
        private fun onButtonClick() {
            val rand = Random.nextInt(0, 101)
            Toast.makeText(this, "Valor gerado: $rand" , Toast.LENGTH_SHORT).show()
        }
    }