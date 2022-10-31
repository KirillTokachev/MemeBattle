package com.example.memebattle.presentation.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.memebattle.data.mappers.JsonMapToMeme
import com.example.memebattle.data.use_case_impl.meme_use_case_impl.GetMemesUseCaseImpl
import com.example.memebattle.data.use_case_impl.meme_use_case_impl.SaveMemesUseCaseImpl
import com.example.memebattle.data.use_case_impl.network_use_case.FetchMemesUseCaseImpl
import kotlinx.coroutines.launch
import javax.inject.Inject

class MemeViewModel @Inject constructor(
    private val fetchMemesUseCase: FetchMemesUseCaseImpl,
    private val getMemesUseCase: GetMemesUseCaseImpl,
    private val saveMemesUseCase: SaveMemesUseCaseImpl,
    private val jsonMapper: JsonMapToMeme
) : ViewModel() {

    val meme = getMemesUseCase.loadMemes()

    init {
        viewModelScope.launch {
            loadData()
        }
    }

    private suspend fun loadData() {
        saveMemesUseCase.saveMemes(
            jsonMapper(fetchMemesUseCase.fetchMemesUseCase())
        )
    }
}