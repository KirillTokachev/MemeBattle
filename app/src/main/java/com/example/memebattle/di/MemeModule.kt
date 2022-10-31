package com.example.memebattle.di

import android.app.Application
import com.example.memebattle.data.database.AppDataBase
import com.example.memebattle.data.database.MemeDao
import com.example.memebattle.data.repository.MemeRepositoryImpl
import com.example.memebattle.domain.repository.MemeRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface MemeModule {

    @Binds
    fun bindMemeRepository(impl: MemeRepositoryImpl): MemeRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideMemeDao(application: Application): MemeDao {
            return AppDataBase.getInstance(application).getMemeDao()
        }
    }
}