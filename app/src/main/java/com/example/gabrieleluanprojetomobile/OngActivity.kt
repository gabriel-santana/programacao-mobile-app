package com.example.gabrieleluanprojetomobile


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.gabrieleluanprojetomobile.databinding.ActivityOutraBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOngBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}


