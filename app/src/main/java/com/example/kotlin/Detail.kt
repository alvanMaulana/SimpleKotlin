package com.example.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val intent = intent

        val nama = intent.getStringExtra("nama")

        txt_nama.text = nama.toString()

        val panggil = Globals.Dipilih
        val bitmap = panggil.returnimage()

        gambar.setImageBitmap(bitmap)


    }
}
