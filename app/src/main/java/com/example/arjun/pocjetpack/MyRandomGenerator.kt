package com.example.arjun.pocjetpack

import android.util.Log
import com.example.arjun.pocjetpack.Constants.Companion.TAG
import java.util.*

class MyRandomGenerator {
    private lateinit var myRandomNumber: String



    fun getNumber(): String {
        Log.i(TAG, "get number")
        if (!::myRandomNumber.isInitialized) {
            this.createNumber()
        }
        return myRandomNumber
    }


    fun createNumber() {
        Log.i(TAG,"Create new number")
        val random = Random()
        myRandomNumber="Number :"+(random.nextInt(10+1)+1)
    }
}