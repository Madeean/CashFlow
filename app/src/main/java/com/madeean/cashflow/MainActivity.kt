package com.madeean.cashflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_masuk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_masuk = findViewById(R.id.btn_simpan_mainactivity)
        btn_masuk.setOnClickListener {
            val intent: Intent = Intent(this@MainActivity, HomePage::class.java)
            startActivity(intent);
        }
    }
}