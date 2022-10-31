package com.example.memebattle.di

import android.app.Application
import android.content.Context
import com.example.memebattle.presentation.MainFragment
import com.example.memebattle.presentation.MemeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        MemeModule::class,
        MemeUseCaseModule::class,
        QuestionModule::class,
        QuestionUseCaseModule::class,
        NetworkModule::class,
        FetchUseCaseModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(fragment: MainFragment)

    fun inject(fragment: MemeFragment)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}