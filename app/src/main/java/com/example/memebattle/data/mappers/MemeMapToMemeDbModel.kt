package com.example.memebattle.data.mappers

import com.example.memebattle.data.database.MemeDbModel
import com.example.memebattle.domain.model.Meme
import javax.inject.Inject

class MemeMapToMemeDbModel @Inject constructor() : (Meme) -> MemeDbModel {

    override fun invoke(entity: Meme) =
        with(entity) {
            MemeDbModel(
                memeID = memeID,
                imageMeme = imageMeme
            )
        }
}