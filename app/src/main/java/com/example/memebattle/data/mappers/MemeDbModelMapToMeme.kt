package com.example.memebattle.data.mappers

import com.example.memebattle.data.database.MemeDbModel
import com.example.memebattle.domain.model.Meme
import javax.inject.Inject

class MemeDbModelMapToMeme @Inject constructor() : (MemeDbModel) -> Meme {

    override fun invoke(dbModel: MemeDbModel) =
        with(dbModel) {
            Meme(
                memeID = memeID,
                imageMeme = imageMeme
            )
        }
}