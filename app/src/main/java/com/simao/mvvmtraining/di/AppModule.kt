package com.simao.mvvmtraining.di

import com.simao.mvvmtraining.repository.BookDAO
import com.simao.mvvmtraining.repository.BookRepository
import com.simao.mvvmtraining.ui.BookViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val module : Module = module {
    viewModel { BookViewModel(androidContext()) }
}

