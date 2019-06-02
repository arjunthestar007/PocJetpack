package com.example.arjun.pocjetpack

import android.widget.ImageView
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class Contact( _name:String, _email:String): BaseObservable(){
    @get:Bindable
    var name :String=_name
    set(value) {
        field=value
        notifyPropertyChanged(BR.name)
    }
    @get:Bindable
    var email :String=_email
    set(value) {
        field=value
        notifyPropertyChanged(BR.email)

    }

    val imageUrl="https://i.redd.it/lhw4vp5yoy121.jpg"


    companion object {
       @JvmStatic @BindingAdapter("profileImage")
        fun loadimage(imageView: ImageView,imageUrl:String){
            Glide.with(imageView.context).load("https://i.redd.it/lhw4vp5yoy121.jpg").into(imageView)

        }
    }

}