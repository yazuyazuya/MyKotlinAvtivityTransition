package com.example.yazuyazuya.mykotlinavtivitytransition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            finish()
        }

    }
}
