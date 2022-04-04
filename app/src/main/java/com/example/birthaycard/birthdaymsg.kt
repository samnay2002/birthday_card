package com.example.birthaycard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_birthdaymsg.*

class birthdaymsg : AppCompatActivity() {
    companion object
    {
        const val sanmay="name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaymsg)

        val name=intent.getStringExtra(sanmay)
        textView2nd.text="Happy birthday\n $name!!"
    }
}