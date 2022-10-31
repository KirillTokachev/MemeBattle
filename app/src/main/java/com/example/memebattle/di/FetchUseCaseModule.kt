package com.example.memebattle.di

import com.example.memebattle.data.use_case_impl.network_use_case.FetchMemesUseCaseImpl
import com.example.memebattle.data.use_case_impl.network_use_case.FetchQuestionUseCaseImpl
import com.example.memebattle.domain.use_cases.network_use_case.FetchMemesUseCase
import com.example.memebattle.domain.use_cases.network_use_case.FetchQuestionUseCase
import dagger.Binds
import dagger.Module

@Module
interface FetchUseCaseModule {

    @Binds
    fun bindFetchMemesUseCase(impl: FetchMemesUseCaseImpl): FetchMemesUseCase

    @Binds
    fun bindFetchQuestionUseCase(impl: FetchQuestionUseCaseImpl): FetchQuestionUseCase
}