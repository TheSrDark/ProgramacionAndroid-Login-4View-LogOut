package com.example.tarea01jme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.annotation.SuppressLint
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent

class Pagina5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina5)


        val btn: Button = findViewById(R.id.btnInicioPag5)

        btn.setOnClickListener {
            val intent: Intent = Intent(this, Pagina2::class.java)
            startActivity(intent)

        }





    }
}