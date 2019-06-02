package com.example.arjun.pocjetpack

import android.content.Context
import android.view.View
import android.widget.Toast

open class EventHandler(context: Context) {
    val myContext:Context=context

     fun onButtonClick(){
        Toast.makeText(myContext,"Hello",Toast.LENGTH_SHORT).show()
    }
}