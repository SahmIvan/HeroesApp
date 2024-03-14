package com.example.heroesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.heroesapp.mock.MockData
import com.google.android.material.snackbar.Snackbar

class login : AppCompatActivity() {
    private lateinit var logInBtn : Button
    private lateinit var emailET : EditText
    private lateinit var passwordET : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val sharedPreferences = getSharedPreferences("myprefs", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)
        if(isLogged){
            val intent = Intent(this@login,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
//        Inicializar las vistas
        logInBtn = findViewById(R.id.loginBtn)
        emailET = findViewById(R.id.emailET)
        passwordET = findViewById(R.id.passwordET)
//        Configurar el evento click del boton
        logInBtn.setOnClickListener{
            Log.i("INGENIERIA", "Boton presionado")
            val email = emailET.text.toString()
            val password = passwordET.text.toString()
//            Validar que el correo y la contraseña no esten vacios
            if(email.isEmpty() || password.isEmpty()){
                Log.i("INVALID", "invalid credentials")
                Snackbar.make(it, "El correo o contraseña están vacios", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//            Validar que el correo y la contraseña sean validos
            val isValidUser = MockData.users.any{ u -> u.email == email && u.password == password }
            if(!isValidUser){
                Snackbar.make(it, "El correo o la contraseña no son validos", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//            Guardar el estado de la sesion
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.apply()
//            Redirigir a la pantalla principal
            val intent = Intent(this@login, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}