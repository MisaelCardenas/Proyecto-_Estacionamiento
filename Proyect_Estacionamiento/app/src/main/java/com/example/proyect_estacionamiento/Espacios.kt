package com.example.proyect_estacionamiento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyect_estacionamiento.databinding.ActivityEspaciosBinding


class Espacios : AppCompatActivity() {
    //vincular la vista
    private lateinit var binding: ActivityEspaciosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEspaciosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
