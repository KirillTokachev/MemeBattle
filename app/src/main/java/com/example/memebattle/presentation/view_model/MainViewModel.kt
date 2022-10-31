package com.example.memebattle.presentation.view_model

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.memebattle.data.mappers.JsonMapToQuestion
import com.example.memebattle.data.use_case_impl.network_use_case.FetchQuestionUseCaseImpl
import com.example.memebattle.data.use_case_impl.question_use_case_impl.GetQuestionsUseCaseImpl
import com.example.memebattle.data.use_case_impl.question_use_case_impl.SaveQuestionUseCaseImpl
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val fetchQuestionUseCase: FetchQuestionUseCaseImpl,
    private val getQuestionUseCase: GetQuestionsUseCaseImpl,
    private val saveQuestionUseCase: SaveQuestionUseCaseImpl,
    private val jsonMapper: JsonMapToQuestion
) : ViewModel() {

    val questionList = getQuestionUseCase.loadQuestions()

    init {
        viewModelScope.launch {
            loadData()
        }
    }

    private suspend fun loadData() {
        saveQuestionUseCase.saveQuestions(
            jsonMapper(fetchQuestionUseCase.fetchQuestions())
        )
    }
}