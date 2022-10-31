package com.example.memebattle.domain.use_cases.question_use_case

import androidx.lifecycle.LiveData
import com.example.memebattle.domain.model.Question

interface GetQuestionsUseCase {

    fun loadQuestions(): LiveData<List<Question>>
}