package com.example.memebattle.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class QuestionDbModel(
    @PrimaryKey val questionID: Long,
    val question: String
)