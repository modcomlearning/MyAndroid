package com.modcom.interest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Access ids in xml
        calculate.setOnClickListener{

            //get ids from xml, get their values, to string tehn to double or to int
            val p = principle.text.toString().toDouble()
            val r = rate.text.toString().toDouble()
            val t = time.text.toString().toDouble()

            //do maths
            val interest = (p * r  *t /100)

            //now put the interest to answer text view
            answer.text = "Interest $interest KES"

        }//end


    }
}