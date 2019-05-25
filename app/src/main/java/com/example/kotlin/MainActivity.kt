package com.example.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_kalkulator.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val intent = intent
        val txtnama:String = intent.getStringExtra("nama")
        textView.text = txtnama







        var pindah = findViewById(R.id.pindah) as Button
        pindah.setOnClickListener{
            val intent = Intent(applicationContext,kalkulator::class.java)
            startActivity(intent)


        }
    }

    fun tekanTombol(view: View){


        imageView.setImageResource(R.drawable.kotlin)
        if(imageView.getTag()=="kotlin"){
            imageView.setImageResource(R.drawable.java)
            imageView.setTag("java")
        }
        else{
            imageView.setImageResource(R.drawable.kotlin)
            imageView.setTag("kotlin")
        }
    }
}
