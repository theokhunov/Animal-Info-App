package com.theokhunov.animalinfo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.theokhunov.animalinfo.R
import com.theokhunov.animalinfo.Uitel.getProgessDrawable
import com.theokhunov.animalinfo.Uitel.loadImage
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)


        /**get Data*/
        val animalIntent = intent
        val animalName = animalIntent.getStringExtra("name")
        val animalInfo = animalIntent.getStringExtra("info")
        val animalImg = animalIntent.getStringExtra("img")

        /**call text and images*/
        name.text = animalName
        info.text = animalInfo
        img.loadImage(animalImg, getProgessDrawable(this))


    }
}