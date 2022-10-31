package com.example.memebattle.domain.repository

import androidx.lifecycle.LiveData
import com.example.memebattle.domain.model.Meme

interface MemeRepository {

    fun getMeme(): LiveData<List<Meme>>

    suspend fun setMeme(meme: List<Meme>)
}