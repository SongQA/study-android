package com.example.study_kotlin.jaeeun.config

import android.app.Application
import com.example.study_kotlin.jaeeun.repository.TodoRepository

class ApplicationClass : Application() {

    override fun onCreate() {
        super.onCreate()

        TodoRepository.initialize(this)
    }
}