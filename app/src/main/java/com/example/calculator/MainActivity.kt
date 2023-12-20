package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var bu0:Button
    lateinit var bu1:Button
    lateinit var bu2:Button
    lateinit var bu3:Button
    lateinit var bu4:Button
    lateinit var bu5:Button
    lateinit var bu6:Button
    lateinit var bu7:Button
    lateinit var bu8:Button
    lateinit var bu9:Button
    lateinit var buac:Button
    lateinit var buadd:Button
    lateinit var buoff:Button
    lateinit var buhun:Button
    lateinit var bumin:Button
    lateinit var budiv:Button
    lateinit var buequal:Button
    lateinit var budot:Button
    lateinit var bumul:Button
 lateinit  var showtext:TextView
    var newop=true
    var oldnumber:String=""
    var sign="+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bu0=findViewById(R.id.bu0)
        bu1=findViewById(R.id.bu1)
        bu2=findViewById(R.id.bu2)
        bu3=findViewById(R.id.bu3)
        bu4=findViewById(R.id.bu4)
        bu5=findViewById(R.id.bu5)
        bu6=findViewById(R.id.bu6)
        bu7=findViewById(R.id.bu7)
        bu8=findViewById(R.id.bu8)
        bu9=findViewById(R.id.bu9)
        budot=findViewById(R.id.budot)
        budiv=findViewById(R.id.budiv)
        bumin=findViewById(R.id.bumin)
        bumul=findViewById(R.id.bumul)
        buequal=findViewById(R.id.buequal)
        buac=findViewById(R.id.buac)
        buadd=findViewById(R.id.buadd)
        buhun=findViewById(R.id.buhun)
        buoff=findViewById(R.id.buoff)
        showtext=findViewById(R.id.showtext)



    }

    fun opp(view: View) {
        if (newop==true){
            showtext.text=""
            newop=false
        }
        when(view){
           bu0->showtext.text=showtext.text.toString()+"0"
           bu1->showtext.text=showtext.text.toString()+"1"
           bu2->showtext.text=showtext.text.toString()+"2"
           bu3->showtext.text=showtext.text.toString()+"3"
           bu4->showtext.text=showtext.text.toString()+"4"
           bu5->showtext.text=showtext.text.toString()+"5"
           bu6->showtext.text=showtext.text.toString()+"6"
           bu7->showtext.text=showtext.text.toString()+"7"
           bu8->showtext.text=showtext.text.toString()+"8"
           bu9->showtext.text=showtext.text.toString()+"9"
           budot->showtext.text=showtext.text.toString()+"."
           bumin->showtext.text="-" +showtext.text.toString()

        }
    }

    fun operation(view: View) {

                when(view){
          buadd->sign="+"
          bumul->sign="*"
          buoff->sign="-"
          budiv->sign="/"
        }
        oldnumber=showtext.text.toString()
        showtext.text=""




    }

    @SuppressLint("SuspiciousIndentation")
    fun result(view: View) {
    var  finalNumber:Double=0.0
        when(sign){
        "+"-> finalNumber=oldnumber.toDouble()+showtext.text.toString().toDouble()
        "-"-> finalNumber=oldnumber.toDouble()-showtext.text.toString().toDouble()
        "*"-> finalNumber=oldnumber.toDouble()*showtext.text.toString().toDouble()
        "/"-> finalNumber=oldnumber.toDouble()/showtext.text.toString().toDouble()


        }
        showtext.text=finalNumber.toString()

    }

    fun ac(view: View) {
        showtext.text="0"
        newop=true
    }


}