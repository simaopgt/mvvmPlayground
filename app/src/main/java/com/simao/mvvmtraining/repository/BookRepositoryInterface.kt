package com.simao.mvvmtraining.repository

import androidx.lifecycle.LiveData
import com.simao.mvvmtraining.model.BookEntity

interface BookRepositoryInterface {
    suspend fun insert(book: BookEntity)

    fun allBooks() : LiveData<List<BookEntity>>
}