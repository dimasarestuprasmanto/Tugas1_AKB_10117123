package com.example.tugas1_akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main4Activity : AppCompatActivity() {

    lateinit var Text : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var intent = intent
        val text = intent.getStringExtra("Nama")

        val hasil = findViewById<TextView>(R.id.textView8)
        hasil.text = "Beres! Sekarang "+text+" udah bisa ngecek pengunaan HP "+text+" tiap hari buat bantu "+text+" ngatur waktu :)"

        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}
    }
}
