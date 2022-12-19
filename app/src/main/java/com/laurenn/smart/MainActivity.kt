package com.laurenn.smart

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val connect=findViewById<Button>(R.id.button_connected)
        connect.setOnClickListener(View.OnClickListener { view: View? ->
            println("OOOOOOH !")
        })
    }
}