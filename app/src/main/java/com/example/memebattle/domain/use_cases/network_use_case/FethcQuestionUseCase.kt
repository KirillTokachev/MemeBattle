package com.example.memebattle.domain.use_cases.network_use_case

import com.google.gson.JsonObject

interface FetchQuestionUseCase {

    suspend fun fetchQuestions(): JsonObject
}