package com.example.memebattle.data.mappers

import com.example.memebattle.domain.model.Question
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import javax.inject.Inject

class JsonMapToQuestion @Inject constructor() : (JsonObject) -> List<Question> {

    override fun invoke(jsonObject: JsonObject): List<Question> {
        val jsonArray = jsonObject["results"]
        val typeToken = object : TypeToken<List<Question>>() {}.type
        return Gson().fromJson(jsonArray, typeToken)
    }
}