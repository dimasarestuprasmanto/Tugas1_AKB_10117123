package com.example.tugas1_akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.widget.Button;

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }

}
/*
Tanggal Pengerjaan 7 april 2020
Deskripsi : Membuat projek MainActivity,Main2Activity,Main3Activity,Main4Activity, Membuat semua layout dan membuat activity button
            untuk menghubungkan setiap layout, mengambil string di layout Nama Panggilan Kamu dan memindahkannya kedalam layout4(activity_main4),
            membuat validasi di kode yang berisi harus huruf kapital dan wajib terisi 6 huruf/angka, Membuat validasi nama harus diisi

Tanggal Pengerjaan 8 april 2020
Deskripsi : Menambahkan validasi umur tidak boleh kosong

NIM = 10117123
NAMA = Dimas Arestu Prasmanto
Kelas = IF4
 */
