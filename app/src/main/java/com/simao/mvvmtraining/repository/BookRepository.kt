package com.simao.mvvmtraining.repository

import androidx.lifecycle.LiveData
import com.simao.mvvmtraining.model.BookEntity

class BookRepository(private val bookDAO: BookDAO) : BookRepositoryInterface {

    override suspend fun insert (book: BookEntity) {
        bookDAO.insert(book)
    }

    override fun allBooks(): LiveData<List<BookEntity>> {
        return bookDAO.getAll()
    }
}