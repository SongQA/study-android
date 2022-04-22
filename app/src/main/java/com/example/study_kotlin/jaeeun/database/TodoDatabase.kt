package com.example.study_kotlin.jaeeun.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.study_kotlin.jaeeun.dao.TodoDao
import com.example.study_kotlin.jaeeun.dto.Todo

@Database(entities = arrayOf(Todo::class), version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}