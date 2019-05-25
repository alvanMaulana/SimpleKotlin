package com.example.kotlin

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_listview.*

class listview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        var kumpulanNama = ArrayList<String>()
        kumpulanNama.add("Kopi")
        kumpulanNama.add("Teh")
        kumpulanNama.add("Gula")
        kumpulanNama.add("Sugar")
        kumpulanNama.add("Coffe")
        kumpulanNama.add("Tea")


        val kopi1 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kopi)
        val teh1 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.teh)
        val gula1 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.gula)
        val kopi2 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kopi)
        val teh2 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.teh)
        val gula2 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.gula)



        var kumpulanGambar = ArrayList<Bitmap>()
        kumpulanGambar.add(kopi1)
        kumpulanGambar.add(teh1)
        kumpulanGambar.add(gula1)
        kumpulanGambar.add(kopi2)
        kumpulanGambar.add(teh2)
        kumpulanGambar.add(gula2)


        val arrayAdapter = ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,kumpulanNama)
        listView.setAdapter(arrayAdapter)

        listView.onItemClickListener = AdapterView.OnItemClickListener{adapterView, view, i, l ->
            val intent = Intent(applicationContext,Detail::class.java)
            intent.putExtra("nama",kumpulanNama[i])

            val panggil = Globals.Dipilih
            panggil.gambarTerpilih = kumpulanGambar[i]

            startActivity(intent)
        }



    }
}
