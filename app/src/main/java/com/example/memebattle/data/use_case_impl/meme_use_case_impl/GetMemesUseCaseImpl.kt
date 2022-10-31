package com.example.memebattle.data.use_case_impl.meme_use_case_impl

import androidx.lifecycle.LiveData
import com.example.memebattle.domain.model.Meme
import com.example.memebattle.domain.repository.MemeRepository
import com.example.memebattle.domain.use_cases.meme_use_case.GetMemesUseCase
import javax.inject.Inject

class GetMemesUseCaseImpl @Inject constructor(
    private val memeRepository: MemeRepository
) : GetMemesUseCase {

    override fun loadMemes(): LiveData<List<Meme>> {
        return memeRepository.getMeme()
    }
}