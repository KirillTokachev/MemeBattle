package com.example.memebattle.data.use_case_impl.question_use_case_impl

import com.example.memebattle.domain.model.Question
import com.example.memebattle.domain.repository.QuestionRepository
import com.example.memebattle.domain.use_cases.question_use_case.SaveQuestionsUseCase
import javax.inject.Inject

class SaveQuestionUseCaseImpl @Inject constructor(
    private val questionRepository: QuestionRepository
) : SaveQuestionsUseCase {

    override suspend fun saveQuestions(questions: List<Question>) {
        questionRepository.setQuestions(questions)
    }
}