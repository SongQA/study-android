package com.example.study_kotlin

import android.content.Intent
import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.study_kotlin.jaeeun.dto.Todo
import kotlinx.android.synthetic.main.activity_edit_todo_ahn1.*

class activityEditTodoAhn1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnSave.setOnClickListener {
            val title = etTodoTitle.text.toString()
            val content = etTodoContent.text.toString()
            val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm").format(System.currentTimeMillis())

            if (title.isNotEmpty() && content.isNotEmpty()) {
                val todo = Todo(0, title, content, timestamp, false)
                val intent = Intent().apply {
                    putExtra("todo", todo)
                    putExtra("flag", 0)
                }
                setResult(RESULT_OK, intent)
                finish()
            }
        }

        setContentView(R.layout.activity_edit_todo_ahn1)
    }
}