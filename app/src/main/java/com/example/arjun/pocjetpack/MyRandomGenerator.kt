package com.example.arjun.pocjetpack

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.arjun.pocjetpack.Constants.Companion.TAG
import java.util.*

class MyRandomGenerator : ViewModel() {

    private lateinit var myRandomNumber: MutableLiveData<String>


    fun getNumber(): MutableLiveData<String> {
        Log.i(TAG, "get number")
        if (!::myRandomNumber.isInitialized) {
            myRandomNumber=MutableLiveData()
            this.createNumber()
        }
        return myRandomNumber
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG,"Viewmodel Destroyed")
    }

    fun createNumber() {
        Log.i(TAG,"Create new number")
        val random = Random()
        myRandomNumber.value="Number :"+(random.nextInt(10+1)+1)
    }
}