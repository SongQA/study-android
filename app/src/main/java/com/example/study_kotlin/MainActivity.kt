package com.example.study_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button5.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.button1 -> {val nextIntent = Intent(this, activity_ahn1::class.java)
                startActivity(nextIntent)}
            R.id.button2 -> {val nextIntent = Intent(this, activity_jeong::class.java)
                startActivity(nextIntent)}
            R.id.button3 -> {val nextIntent = Intent(this, activity_lym::class.java)
                startActivity(nextIntent)}
            R.id.button4 -> {val nextIntent = Intent(this, activity_chun::class.java)
                startActivity(nextIntent)}
            R.id.button5 -> {val nextIntent = Intent(this, activity_song::class.java)
                startActivity(nextIntent)}
            R.id.button6 -> {val nextIntent = Intent(this, activity_ahn2::class.java)
                startActivity(nextIntent)}
        }
    }
}