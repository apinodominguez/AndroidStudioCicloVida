package com.example.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MisMensajes","Estoy en OnCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Mismensaje", "Estoy oen Oncreate")
    }

    
}
