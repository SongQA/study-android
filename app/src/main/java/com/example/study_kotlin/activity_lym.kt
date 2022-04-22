package com.example.study_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_lym.*

class activity_lym : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lym)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, mjMainActivity_lym::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3초 대기 시 mjMainActivity 로 이동
    }
}