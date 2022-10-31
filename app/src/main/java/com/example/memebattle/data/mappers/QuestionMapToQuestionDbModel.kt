package com.example.memebattle.data.mappers

import com.example.memebattle.data.database.QuestionDbModel
import com.example.memebattle.domain.model.Question
import javax.inject.Inject

class QuestionMapToQuestionDbModel @Inject constructor() : (Question) -> QuestionDbModel {

    override fun invoke(entity: Question) =
        with(entity) {
            QuestionDbModel(
                questionID = questionID,
                question = question
            )
        }
}