package com.example.marin_david_p1_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.marin_david_p1_ui.databinding.ActivityEj4Binding

class Ej4Activity : AppCompatActivity() {
    private lateinit var binding : ActivityEj4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonEj4Si.setOnClickListener{
            Toast.makeText(this, "Has pulsado SI\nUsas iExplorer", Toast.LENGTH_SHORT).show()
        }

        binding.botonEj4No.setOnClickListener{
            Toast.makeText(this, "Has pulsado NO\nNo usas iExplorer", Toast.LENGTH_SHORT).show()
        }

        binding.botonEJ4AVeces.setOnClickListener{
            Toast.makeText(this, "Has pulsado A VECES\nUsas iExplorer a veces", Toast.LENGTH_SHORT).show()
        }
    }
}