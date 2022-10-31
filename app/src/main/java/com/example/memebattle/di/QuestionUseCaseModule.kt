package com.example.memebattle.di

import com.example.memebattle.data.use_case_impl.question_use_case_impl.GetQuestionsUseCaseImpl
import com.example.memebattle.data.use_case_impl.question_use_case_impl.SaveQuestionUseCaseImpl
import com.example.memebattle.domain.use_cases.question_use_case.GetQuestionsUseCase
import com.example.memebattle.domain.use_cases.question_use_case.SaveQuestionsUseCase
import dagger.Binds
import dagger.Module

@Module
interface QuestionUseCaseModule {

    @Binds
    fun bindGetQuestionsUseCase(impl:GetQuestionsUseCaseImpl): GetQuestionsUseCase

    @Binds
    fun bindSaveQuestionsUseCase(impl: SaveQuestionUseCaseImpl): SaveQuestionsUseCase
}