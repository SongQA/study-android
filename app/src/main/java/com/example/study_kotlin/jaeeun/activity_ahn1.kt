package com.example.study_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.study_kotlin.databinding.ActivityMainBinding
import com.example.study_kotlin.jaeeun.dto.Todo
import com.example.study_kotlin.jaeeun.viewmodel.TodoViewModel
import kotlinx.android.synthetic.main.activity_ahn1.*

class activity_ahn1 : AppCompatActivity() {
    lateinit var todoViewModel: TodoViewModel
    lateinit var binding: ActivityMainBinding
    private var list = mutableListOf<Todo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var todoViewModel: TodoViewModel
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fabAdd.setOnClickListener {
            val intent = Intent(this, activityEditTodoAhn1::class.java).apply {
                putExtra("type", "ADD")
            }
            requestActivity.launch(intent)
        }
    }
    private val requestActivity = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {}
}
