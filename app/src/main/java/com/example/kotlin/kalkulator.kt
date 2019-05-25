package com.example.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_kalkulator.*
import java.lang.Integer.parseInt
import net.objecthunter.exp4j.ExpressionBuilder

class kalkulator : AppCompatActivity() {
    var angka1 : Int = 0
    var angka2 : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

       pindah.setOnClickListener{
           val intent = Intent(applicationContext,MainActivity::class.java)
           intent.putExtra("nama",edit1.text.toString())
           startActivity(intent)


       }


    }


    fun tambah(view:View){
        ambil()
       var hasil = angka1 + angka2
        txt1.text = hasil.toString()

    }
    fun kurang(view:View){
        ambil()
        var hasil = angka1 - angka2
        txt1.setText(hasil.toString())

    }
    fun kali(view:View){
        var hasil = angka1 * angka2
        txt1.setText(hasil.toString())

    }
    fun bagi(view:View){
        ambil()
        var hasil = angka1 / angka2
        txt1.setText(hasil.toString())

    }

    fun ambil(){
        angka1 = Integer.parseInt(input1.text.toString())
        angka2 = Integer.parseInt(input2.text.toString())
    }



}
