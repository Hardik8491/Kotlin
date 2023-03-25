package com.example.birthdaygeet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView


class secondpage : AppCompatActivity() {
    companion  object{

        const val NAME_EXTRA="name_extra"

    }

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)




        val name =intent.getStringExtra(NAME_EXTRA)
        var  brithdayGreeting=findViewById<TextView>(R.id.brithdayGreeting)
        brithdayGreeting.text = "HappyBithday\n$name"


    }
}