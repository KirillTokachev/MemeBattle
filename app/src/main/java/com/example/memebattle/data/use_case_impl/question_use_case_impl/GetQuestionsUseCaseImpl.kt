package com.example.memebattle.data.use_case_impl.question_use_case_impl

import androidx.lifecycle.LiveData
import com.example.memebattle.domain.model.Question
import com.example.memebattle.domain.repository.QuestionRepository
import com.example.memebattle.domain.use_cases.question_use_case.GetQuestionsUseCase
import javax.inject.Inject

class GetQuestionsUseCaseImpl @Inject constructor(
    private val questionRepository: QuestionRepository
) : GetQuestionsUseCase {

    override fun loadQuestions(): LiveData<List<Question>> {
        return questionRepository.getQuestions()
    }
}