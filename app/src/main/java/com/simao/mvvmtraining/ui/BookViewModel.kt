package com.simao.mvvmtraining.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simao.mvvmtraining.model.BookEntity
import com.simao.mvvmtraining.repository.BookRepositoryInterface
import kotlinx.coroutines.launch

class BookViewModel(private val bookRepository : BookRepositoryInterface) : ViewModel() {

    val allBooks: LiveData<List<BookEntity>> = bookRepository.allBooks()

    fun insert(book: BookEntity) = viewModelScope.launch {
        bookRepository.insert(book)
    }

}