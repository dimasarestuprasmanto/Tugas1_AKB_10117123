package com.example.tugas1_akb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Main3Activity : AppCompatActivity() {

    lateinit var Nama : EditText
    lateinit var button4 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        Nama = findViewById(R.id.editText)
        button4 = findViewById(R.id.button4)

        button4.setOnClickListener {
            var name = Nama.text.toString()

            if(name.isEmpty()){
                Toast.makeText(this, "Nama Tidak Boleh Dikosongkan",Toast.LENGTH_LONG).show();
                return@setOnClickListener
            }
            val intent = Intent(this, Main4Activity::class.java)
            intent.putExtra( "Nama", name )
            startActivity(intent)
        }
    }
}
