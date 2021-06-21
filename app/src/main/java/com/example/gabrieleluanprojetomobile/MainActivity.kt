package com.example.gabrieleluanprojetomobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    binding.actionButton.setOnClickListener {
        val intent = Intent(this, OutraActivity::class.java)
        //intent.putExtra("MENSAGEM", "Olá!")
        //intent.putExtra("NUMERO", 42)
        startActivity(intent)
    }
}


