package com.example.memebattle.di

import android.app.Application
import com.example.memebattle.data.database.AppDataBase
import com.example.memebattle.data.database.QuestionDao
import com.example.memebattle.data.repository.QuestionRepositoryImpl
import com.example.memebattle.domain.repository.QuestionRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface QuestionModule {

    @Binds
    fun bindQuestionRepository(impl: QuestionRepositoryImpl): QuestionRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideQuestionDao(application: Application): QuestionDao {
            return AppDataBase.getInstance(application).getQuestionDao()
        }
    }
}