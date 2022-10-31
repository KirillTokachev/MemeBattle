package com.example.memebattle.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface QuestionDao {

    @Query("SELECT * FROM questions")
    fun loadQuestions(): LiveData<List<QuestionDbModel>>

    @Insert(entity = QuestionDbModel::class, onConflict = REPLACE)
    suspend fun saveQuestions(questions: List<QuestionDbModel>)
}