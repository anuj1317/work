package com.example.workers1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task2)

//       checkin.setOnClickListener {
//           val intent=Intent(this,MainActivity2::class.java)
//           startActivity(intent)
//       }
    }
}