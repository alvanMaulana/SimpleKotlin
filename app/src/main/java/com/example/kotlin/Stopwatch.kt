package com.example.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_stopwatch.*

class Stopwatch : AppCompatActivity() {
    var number:Int = 0
    var handler:Handler = Handler()
    var runnable :Runnable = Runnable { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)
    }

    fun start(view : View){
        number = 0
        runnable = object :Runnable{
            override fun run() {
                sw.text = number.toString()
                number++
                sw.text = number.toString()
                handler.postDelayed(this,1000)





            }

        }
        handler.post(runnable)

    }
    fun stop(view : View){
        handler.removeCallbacks(runnable)
        number = 0
        sw.text = number.toString()

    }
}
