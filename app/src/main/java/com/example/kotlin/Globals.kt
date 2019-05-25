package com.example.kotlin

import android.graphics.Bitmap

class Globals{
    companion object Dipilih {

        var gambarTerpilih :Bitmap? = null

                fun returnimage():Bitmap{
                    return gambarTerpilih!!
                }
    }



}