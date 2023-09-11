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


class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.emailTxt)
        passwordEditText = findViewById(R.id.passTxt)
        loginButton = findViewById(R.id.loginBtn)

        loginButton.setOnClickListener {
            validarUsario()



        }
    }




    private fun validarUsario(){
        val usuario = usernameEditText.text.toString()
        val clave = passwordEditText.text.toString()

        if(usuario == "javier" && clave == "123")
        {

            val intent: Intent = Intent(this, Pagina2:: class.java)
            startActivity(intent)

            Toast.makeText(this, "Usuario Correcto", Toast.LENGTH_SHORT).show()




        }else
        {
            Toast.makeText(this, "Este Usuario no existe", Toast.LENGTH_SHORT).show()
        }
    }


}