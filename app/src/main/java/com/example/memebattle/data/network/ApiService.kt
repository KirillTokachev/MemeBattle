package com.example.memebattle.data.network

import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {

    @GET(Gets.QUESTION)
    @Headers(
        "X-Parse-Application-Id: ${Gets.APP_ID}",
        "X-Parse-REST-API-Key: ${Gets.API_KEY}",
        "Content-Type: application/json"
    )
    suspend fun fetchQuestions(): JsonObject

    @GET(Gets.MEME)
    @Headers(
        "X-Parse-Application-Id: ${Gets.APP_ID}",
        "X-Parse-REST-API-Key: ${Gets.API_KEY}",
        "Content-Type: application/json"
    )
    suspend fun fetchMemes(): JsonObject
}