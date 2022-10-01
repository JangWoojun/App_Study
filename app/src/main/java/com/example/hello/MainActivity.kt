package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMyTextView = findViewById<TextView>(R.id.textView)
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        var timesClick = 0

        btnClickMe.setOnClickListener {
            timesClick+=1

            tvMyTextView.text = timesClick.toString()
            Toast.makeText(this,timesClick.toString()+"번 클릭하셨습니다",Toast.LENGTH_LONG).show()
        }



    }
}