package com.example.kotlinfirst
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class main: AppCompatActivity()
{
    fun swit() {
            val intent = Intent(this@main, fuv::class.java)
            startActivity(intent)
        }
    override fun onCreate(savedInstanceState: Bundle?)
    {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val eText=findViewById<EditText>(R.id.tv)
        val sb=findViewById<Button>(R.id.sumbit)
        sb.setOnClickListener {
            var st=eText.text.toString()
            st="Welcome $st"            //String Template is used here rather than using String Concatenation
            Toast.makeText(this@main,st,Toast.LENGTH_LONG).show()
            swit()
        }

    }
}
