package com.example.memebattle.data.use_case_impl.meme_use_case_impl

import com.example.memebattle.domain.model.Meme
import com.example.memebattle.domain.repository.MemeRepository
import com.example.memebattle.domain.use_cases.meme_use_case.SaveMemesUseCase
import javax.inject.Inject

class SaveMemesUseCaseImpl @Inject constructor(
    private val repository: MemeRepository
) : SaveMemesUseCase {

    override suspend fun saveMemes(memes: List<Meme>) {
        repository.setMeme(memes)
    }
}