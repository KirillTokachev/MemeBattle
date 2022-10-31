package com.example.memebattle.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.memebattle.data.database.QuestionDao
import com.example.memebattle.data.mappers.QuestionDbModelMapToQuestion
import com.example.memebattle.data.mappers.QuestionMapToQuestionDbModel
import com.example.memebattle.domain.model.Question
import com.example.memebattle.domain.repository.QuestionRepository
import javax.inject.Inject

class QuestionRepositoryImpl @Inject constructor(
    private val questionDao: QuestionDao,
    private val questionDbModelMapToQuestion: QuestionDbModelMapToQuestion,
    private val questionMapToQuestionDbModel: QuestionMapToQuestionDbModel
) : QuestionRepository {

    override fun getQuestions(): LiveData<List<Question>> {
        return Transformations.map(questionDao.loadQuestions()) {
            it.map { questionDbModel ->
                questionDbModelMapToQuestion(questionDbModel)
            }
        }
    }

    override suspend fun setQuestions(question: List<Question>) {
        questionDao.saveQuestions(question.map {
            questionMapToQuestionDbModel(it)
        })
    }
}