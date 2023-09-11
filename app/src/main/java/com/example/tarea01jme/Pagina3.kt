package com.example.tarea01jme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.Button

class Pagina3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina3)



        val btn: Button = findViewById(R.id.btnInicioPag3)

        btn.setOnClickListener {
            val intent: Intent = Intent(this, Pagina2::class.java)
            startActivity(intent)

        }


    }
}