package com.example.study_kotlin.jaeeun.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.study_kotlin.jaeeun.dto.Todo

@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(dto: Todo)

    @Query("select * from todoTable")
    fun list(): LiveData<MutableList<Todo>>

    @Query("select * from todoTable where id = (:id)")
    fun selectOne(id: Long): Todo

    @Update
    suspend fun update(dto: Todo)

    @Delete
    fun delete(dto: Todo)
}