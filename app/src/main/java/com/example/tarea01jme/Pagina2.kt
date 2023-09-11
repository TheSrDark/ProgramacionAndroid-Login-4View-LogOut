//Autor: Javier Manquian
//AnalistaProgramador

package com.example.tarea01jme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.annotation.SuppressLint
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.widget.TextView


class Pagina2 : AppCompatActivity() {

    private lateinit var btnPagina3: Button
    private lateinit var btnPagina4: Button
    private lateinit var btnPagina5: Button
    private lateinit var txtCerrarSe: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)

        btnPagina3 = findViewById(R.id.btnPag3)
        btnPagina4 = findViewById(R.id.btnPag4)
        btnPagina5 = findViewById(R.id.btnPag5)

        txtCerrarSe = findViewById(R.id.txtCerrarSesion)

        btnPagina3.setOnClickListener {
            val intent: Intent = Intent(this, Pagina3:: class.java)
            startActivity(intent)
        }

       btnPagina4.setOnClickListener{
           val intent: Intent = Intent(this, Pagina4:: class.java)
           startActivity(intent)

       }

        btnPagina5.setOnClickListener {
            val intent: Intent = Intent(this, Pagina5:: class.java)
            startActivity(intent)

        }

        txtCerrarSe.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)

        }




    }
}