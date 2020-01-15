package com.simao.mvvmtraining.di

import androidx.room.Room
import com.simao.mvvmtraining.repository.BookDatabase
import com.simao.mvvmtraining.repository.BookRepository
import com.simao.mvvmtraining.repository.BookRepositoryInterface
import com.simao.mvvmtraining.ui.BookViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val modules : Module = module {

//    Create BookDatabase
    single { Room.databaseBuilder(get(), BookDatabase::class.java, "book_database").build() }

//    Create BookDAO
    single { get<BookDatabase>().bookDao() }

//    Create BookRepository
    single <BookRepositoryInterface> {BookRepository(get())}

//    Create BookViewModel
    viewModel { BookViewModel(get()) }

}

