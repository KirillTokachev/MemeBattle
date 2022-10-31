package com.example.memebattle.domain.use_cases.meme_use_case

import com.example.memebattle.domain.model.Meme

interface SaveMemesUseCase {

    suspend fun saveMemes(memes: List<Meme>)
}