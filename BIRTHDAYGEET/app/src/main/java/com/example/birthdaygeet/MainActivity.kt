package com.example.birthdaygeet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createCardB(view: View) {

        val name=findViewById<EditText>(R.id.nameInput).editableText.toString()


      val intent = Intent(this,secondpage::class.java)
     intent.putExtra(secondpage.NAME_EXTRA,name)
        startActivity(intent)
    }
}