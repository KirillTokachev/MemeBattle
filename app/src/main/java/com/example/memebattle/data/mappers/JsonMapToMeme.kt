package com.example.memebattle.data.mappers

import com.example.memebattle.domain.model.Meme
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import javax.inject.Inject

class JsonMapToMeme @Inject constructor() : (JsonObject) -> List<Meme> {

    override fun invoke(jsonObject: JsonObject): List<Meme> {
        val jsonArray = jsonObject["results"]
        val typeToken = object : TypeToken<List<Meme>>() {}.type
        return Gson().fromJson(jsonArray, typeToken)
    }
}