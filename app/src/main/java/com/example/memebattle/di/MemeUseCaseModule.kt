package com.example.memebattle.di

import com.example.memebattle.data.use_case_impl.meme_use_case_impl.GetMemesUseCaseImpl
import com.example.memebattle.data.use_case_impl.meme_use_case_impl.SaveMemesUseCaseImpl
import com.example.memebattle.domain.use_cases.meme_use_case.GetMemesUseCase
import com.example.memebattle.domain.use_cases.meme_use_case.SaveMemesUseCase
import dagger.Binds
import dagger.Module

@Module
interface MemeUseCaseModule {

    @Binds
    fun bindGetMemeUseCase(impl: GetMemesUseCaseImpl): GetMemesUseCase

    @Binds
    fun bindSaveMemeUseCase(impl: SaveMemesUseCaseImpl): SaveMemesUseCase
}