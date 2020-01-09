package com.simao.mvvmtraining.ui

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simao.mvvmtraining.model.BookEntity
import com.simao.mvvmtraining.repository.BookDatabase
import com.simao.mvvmtraining.repository.BookRepository
import kotlinx.coroutines.launch

class BookViewModel(context: Context) : ViewModel() {
    private val repository : BookRepository
    val allBooks: LiveData<List<BookEntity>>

    init {
        val bookDAO = BookDatabase.getInstance(context).bookDao()
        repository = BookRepository(bookDAO)
        allBooks = repository.allBooks
    }

    fun insert(book: BookEntity) = viewModelScope.launch {
        repository.insert(book)
    }

}