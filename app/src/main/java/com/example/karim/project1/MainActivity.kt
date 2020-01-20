package com.example.karim.project1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.karim.project1.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)
        var message = editText.text.toString()

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            message = editText.text.toString()
            val intent = Intent(this, SecondPage::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)

        }
    }
    }
