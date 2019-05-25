package com.example.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_countdown.*

class Countdown : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_countdown)
    }

    fun mulai(view: View){
        var time:Long
        if(number.text.isEmpty()){
            time = 1
        }
        else {

            time = number.text.toString().toLong()

            object : CountDownTimer((time * 1000), 1000) {
                override fun onFinish() {
                    txt1.text = "0"
                }

                override fun onTick(p0: Long) {
                    txt1.text = (p0 / 1000).toString()
                }

            }.start()
        }
    }
}
