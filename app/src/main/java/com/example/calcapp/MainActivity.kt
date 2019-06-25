package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        try {
            when (v.id) {
                R.id.button1 -> b1()
                R.id.button2 -> b2()
                R.id.button3 -> b3()
                R.id.button4 -> b4()
            }
        }catch (e: Exception){
            Log.d("kotlintest","数値が入力されていません")
        }finally{
            textView1.text = "必ず！数値を！！入力してください！！！"
        }

    }


    private fun b1() {
        val n1 = editText1.text.toString().toDouble()
        val n2 = editText2.text.toString().toDouble()

            val a = n1 + n2
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", a)
            startActivity(intent)
    }


    private fun b2(){
        val n1 = editText1.text.toString().toDouble()
        val n2 = editText2.text.toString().toDouble()

        val a = n1 - n2
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", a)
        startActivity(intent)

    }
    private fun b3(){
        val n1 = editText1.text.toString().toDouble()
        val n2 = editText2.text.toString().toDouble()

        val a = n1 * n2
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", a)
        startActivity(intent)

    }
    private fun b4(){

        val n1 = editText1.text.toString().toDouble()
        val n2 = editText2.text.toString().toDouble()

        val a = n1 / n2
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", a)
        startActivity(intent)
    }


}



