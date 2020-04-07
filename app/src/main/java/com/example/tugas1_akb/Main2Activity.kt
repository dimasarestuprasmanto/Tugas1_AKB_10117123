package com.example.tugas1_akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText
import android.widget.Toast

class Main2Activity : AppCompatActivity() {
    lateinit var Kode : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button2 = findViewById<Button>(R.id.button2)
        Kode = findViewById(R.id.kode);


        button2.setOnClickListener {
            val msg: String = Kode.text.toString()
            if(msg.trim().length<6){
                Toast.makeText(this, "Kode Harus Diisi dengan Benar", Toast.LENGTH_LONG).show();
                return@setOnClickListener
            }
            val intent1 = Intent(this, Main3Activity::class.java)
            startActivity(intent1)
        }
    }
}
