package com.example.study_kotlin

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_ahn2.*

class activity_ahn2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahn2)

        fb_add.setOnClickListener {
            val intentAdd = Intent(this, Activity_add::class.java)

            Log.i(ContentValues.TAG, "Intent")
            startActivity(intentAdd)
        }
    }
}