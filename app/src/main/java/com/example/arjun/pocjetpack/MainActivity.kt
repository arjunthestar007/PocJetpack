package com.example.arjun.pocjetpack

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import com.example.arjun.pocjetpack.Constants.Companion.TAG


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model:MyRandomGenerator=ViewModelProviders.of(this).get(MyRandomGenerator::class.java)
        val myRandom=model.getNumber()
        myRandom.observe(this, Observer<String>{number->
            tvNumber.text=number
        })

        Log.i(TAG,"random number set")

        tvFetch.setOnClickListener {
            model.createNumber()
        }
    }
}
