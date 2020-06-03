package com.example.kotlinfirst
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

open class fuv: AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fuv)
        val rr = findViewById<TextView>(R.id.r)
        val bb=findViewById<Button>(R.id.B)
        val b2=findViewById<Button>(R.id.ee)
        b2.isVisible=false
        bb.setOnClickListener {
            var c:Char?   //null safety
            c= rr.text[0]
            change(c)

        }

    }
    private fun change(c: Char = 'A')  //named argument
    {
        val rr = findViewById<TextView>(R.id.r)
        val bb=findViewById<Button>(R.id.B)
        val b2=findViewById<Button>(R.id.ee)
        if (c<='Y')
        {
            val a=c+1
            rr.text = a.toString()
        }
        else
        {
            bb.isVisible=false
            b2.isVisible=true
            b2.setOnClickListener{
                val inr= Intent(this@fuv, num::class.java)
                startActivity(inr)
            }

        }
    }
}



