package com.example.marin_david_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.marin_david_p1_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton1.setOnClickListener{
            startActivity(Intent (this, Ej1Activity::class.java))
        }
        binding.boton2.setOnClickListener{
            startActivity(Intent (this, Ej2Activity::class.java))
        }

        binding.boton3.setOnClickListener{
            Toast.makeText(this, "Preguntar por el relative layout", Toast.LENGTH_SHORT).show()
        }

        binding.boton4.setOnClickListener{
            startActivity(Intent (this, Ej4Activity::class.java))
        }

        binding.boton5.setOnClickListener{
            startActivity(Intent (this, Ej5Activity::class.java))
        }

        binding.boton6.setOnClickListener{
            startActivity(Intent (this, Ej6Activity::class.java))
        }

        binding.boton7.setOnClickListener{
            Toast.makeText(this, "Preguntar por el relative layout", Toast.LENGTH_SHORT).show()
        }

        binding.boton8.setOnClickListener{
            startActivity(Intent (this, Ej8Activity::class.java))
        }

    }
}