package com.example.memebattle.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.memebattle.data.database.MemeDao
import com.example.memebattle.data.mappers.MemeDbModelMapToMeme
import com.example.memebattle.data.mappers.MemeMapToMemeDbModel
import com.example.memebattle.domain.model.Meme
import com.example.memebattle.domain.repository.MemeRepository
import javax.inject.Inject

class MemeRepositoryImpl @Inject constructor(
    private val memeDao: MemeDao,
    private val memeDbModelMapToMeme: MemeDbModelMapToMeme,
    private val memeMapToMemeDbModel: MemeMapToMemeDbModel
) : MemeRepository {

    override fun getMeme(): LiveData<List<Meme>> {
        return Transformations.map(memeDao.loadMemes()) {
            it.map { memeDbModel ->
                memeDbModelMapToMeme(memeDbModel)
            }
        }
    }

    override suspend fun setMeme(meme: List<Meme>) {
        memeDao.saveMemes(meme.map {
            memeMapToMemeDbModel(it)
        })
    }
}