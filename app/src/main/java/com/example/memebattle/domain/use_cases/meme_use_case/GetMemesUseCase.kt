package com.example.memebattle.domain.use_cases.meme_use_case

import androidx.lifecycle.LiveData
import com.example.memebattle.domain.model.Meme

interface GetMemesUseCase {

    fun loadMemes(): LiveData<List<Meme>>
}