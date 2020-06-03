package com.example.kotlinfirst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class num:AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.num)
        val rr = findViewById<TextView>(R.id.r)
        val bb=findViewById<Button>(R.id.B)
        bb.setOnClickListener {
            var c:Char?   //null safety
            c= rr.text[0]
            change(c)

        }

    }
    private fun change(c: Char)
    {
        val rr = findViewById<TextView>(R.id.r)
        val bb=findViewById<Button>(R.id.B)
        val a:(Char)->Char = {if(c<'9')c+1 else '0'} //lambda - higher order function
        val res=a(c)
        if (res=='0')
        {
            bb.isVisible=false
            val iy= Intent(this@num,main::class.java)
            startActivity(iy)
        }
        else
        {
            rr.text = res.toString()
        }
    }


}