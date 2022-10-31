package com.example.memebattle.data.use_case_impl.network_use_case

import com.example.memebattle.data.network.ApiService
import com.example.memebattle.domain.use_cases.network_use_case.FetchMemesUseCase
import com.google.gson.JsonObject
import javax.inject.Inject

class FetchMemesUseCaseImpl @Inject constructor(
    private val apiService: ApiService
) : FetchMemesUseCase {

    override suspend fun fetchMemesUseCase(): JsonObject {
        return apiService.fetchMemes()
    }
}