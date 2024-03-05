package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btntrue : Button
    private lateinit var btnfalse : Button

    private  val questionBank = listOf(
        Question(R.string.question_jalisco, true),
        Question(R.string.question_caja, false))

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btntrue = findViewById(R.id.btn_true)
        btnfalse = findViewById(R.id.btn_false)

        btntrue.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                "Respuesta Correcta",
                Toast.LENGTH_SHORT).show()
        }
        btnfalse.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                "Respuesta Incorrecta!",
                Toast.LENGTH_SHORT).show()
        }
    }
}