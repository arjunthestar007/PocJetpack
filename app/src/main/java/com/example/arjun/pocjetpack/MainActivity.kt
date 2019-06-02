package com.example.arjun.pocjetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.arjun.pocjetpack.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.tvname.text = "arjun"
//        binding.tvemail.text = "arjunarjun27@gmail.com"


        binding.contact = Contact("arjun", "arjunarjun27@gmail.com")
        binding.handler=EventHandler(this)
       // binding.imageurl="https://i.redd.it/lhw4vp5yoy121.jpg"
    }
}
