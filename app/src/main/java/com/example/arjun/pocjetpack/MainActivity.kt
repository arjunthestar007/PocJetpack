package com.example.arjun.pocjetpack

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.example.arjun.pocjetpack.Constants.Companion.TAG


class MainActivity : AppCompatActivity(){


    lateinit var data:MyRandomGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data= MyRandomGenerator()
        val myrandam=data.getNumber()
        tvNumber.text=myrandam
        Log.i(TAG,"random number set")


    }
}
