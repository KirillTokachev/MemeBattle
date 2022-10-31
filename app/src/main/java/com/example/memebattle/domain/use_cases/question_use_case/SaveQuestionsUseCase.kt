package com.example.memebattle.domain.use_cases.question_use_case

import com.example.memebattle.domain.model.Question

interface SaveQuestionsUseCase {

    suspend fun saveQuestions(questions: List<Question>)
}