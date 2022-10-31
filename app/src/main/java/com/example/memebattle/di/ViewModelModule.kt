package com.example.memebattle.di

import androidx.lifecycle.ViewModel
import com.example.memebattle.presentation.view_model.MainViewModel
import com.example.memebattle.presentation.view_model.MemeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MemeViewModel::class)
    fun bindMemeViewModel(viewModel: MemeViewModel): ViewModel
}