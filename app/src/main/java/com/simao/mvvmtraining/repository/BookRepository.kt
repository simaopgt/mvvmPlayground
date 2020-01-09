package com.simao.mvvmtraining.repository

import androidx.lifecycle.LiveData
import com.simao.mvvmtraining.model.BookEntity

class BookRepository(private val bookDAO: BookDAO) {
    val allBooks: LiveData<List<BookEntity>> = bookDAO.getAll()

    suspend fun insert (book: BookEntity) {
        bookDAO.insert(book)
    }
}