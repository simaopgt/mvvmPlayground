package com.simao.mvvmtraining.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.simao.mvvmtraining.R
import com.simao.mvvmtraining.model.BookEntity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val bookViewModel : BookViewModel by viewModel()

    private val TAG = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindButtom()


        bookViewModel.allBooks.observe(this, Observer { items ->
            Log.d(TAG, "ITEMS: $items")
        })
    }

    fun bindButtom() {
        button.setOnClickListener{
            bookViewModel.insert(BookEntity("Livro 1"))
        }
    }
}
