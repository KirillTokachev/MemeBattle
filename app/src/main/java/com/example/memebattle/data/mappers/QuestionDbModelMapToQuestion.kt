package com.example.memebattle.data.mappers

import com.example.memebattle.data.database.QuestionDbModel
import com.example.memebattle.domain.model.Question
import javax.inject.Inject

class QuestionDbModelMapToQuestion @Inject constructor() : (QuestionDbModel) -> Question {

    override fun invoke(dbModel: QuestionDbModel) =
        with(dbModel) {
            Question(
                questionID = questionID,
                question = question
            )
        }
}