package com.example.birthaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthdaymsg.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText=findViewById(R.id.nameenter)
    }

    fun click(view: View) {
        val clicked= nameenter.editableText.toString()
//        val name=nameInput
//        Toast.makeText(this,"hi $clicked", Toast.LENGTH_LONG).show()
        val intent=Intent(this,birthdaymsg::class.java)
        intent.putExtra(birthdaymsg.sanmay,clicked)
        startActivity(intent)
    }
}