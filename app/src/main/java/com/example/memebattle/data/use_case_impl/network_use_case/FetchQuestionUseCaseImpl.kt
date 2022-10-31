package com.example.memebattle.data.use_case_impl.network_use_case

import com.example.memebattle.data.network.ApiService
import com.example.memebattle.domain.use_cases.network_use_case.FetchQuestionUseCase
import com.google.gson.JsonObject
import javax.inject.Inject

class FetchQuestionUseCaseImpl @Inject constructor(
    private val apiService: ApiService
) : FetchQuestionUseCase {

    override suspend fun fetchQuestions(): JsonObject {
        return apiService.fetchQuestions()
    }
}