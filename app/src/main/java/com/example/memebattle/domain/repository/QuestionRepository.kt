package com.example.memebattle.domain.repository

import androidx.lifecycle.LiveData
import com.example.memebattle.domain.model.Question

interface QuestionRepository {

    fun getQuestions(): LiveData<List<Question>>

    suspend fun setQuestions(question: List<Question>)
}