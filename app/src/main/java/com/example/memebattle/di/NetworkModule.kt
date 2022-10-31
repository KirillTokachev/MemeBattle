package com.example.memebattle.di

import com.example.memebattle.data.network.ApiFactory
import com.example.memebattle.data.network.ApiService
import com.example.memebattle.data.use_case_impl.network_use_case.FetchMemesUseCaseImpl
import com.example.memebattle.data.use_case_impl.network_use_case.FetchQuestionUseCaseImpl
import com.example.memebattle.domain.use_cases.network_use_case.FetchMemesUseCase
import com.example.memebattle.domain.use_cases.network_use_case.FetchQuestionUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
interface NetworkModule {

    @Binds
    fun bindFetchQuestionUseCase(impl: FetchQuestionUseCaseImpl): FetchQuestionUseCase

    @Binds
    fun bindFetchMemesUseCase(impl: FetchMemesUseCaseImpl): FetchMemesUseCase

    companion object {
        @Provides
        @Singleton
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }
    }
}