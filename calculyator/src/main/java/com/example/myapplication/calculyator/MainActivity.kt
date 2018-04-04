 package com.example.myapplication.calculyator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.calculyator.R.id.textViewRandom
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_second.*

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

     fun countMe(view: View){
         val cstr = textView.text.toString()
         var cnt: Int = Integer.parseInt(cstr)
         cnt++
         textView.text = cnt.toString()

     }

     fun randomMe(view: View) {
         val randomIn = Intent(this, SecondActivity::class.java)
         startActivity(randomIn)
         //textViewRandom.text = "32423"
     }

     fun CalcWb4 (view: View) {


         var b4 = button4.text.toString()
         editText2.append(b4)
     }


     fun CalcWb5 (view: View) {


         var b5 = button5.text.toString()
         editText2.append(b5)

     }
     fun CalcWbpl (view: View) {


        var b8 = button8.text.toString()
         editText2.append(b8)

     }
     fun CalcWbeq (view: View) {
         var (a, b) = editText2.text.split("+").map (String::toInt)
         var c = a + b
         var v = c.toString()
         textView.text = v


     }

}
