package com.simao.mvvmtraining.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.simao.mvvmtraining.model.BookEntity

@Dao
interface BookDAO {

    @Query("SELECT * FROM book_items")
    fun getAll() : LiveData<List<BookEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg books : BookEntity)

    @Update
    suspend fun update(vararg books : BookEntity)

    @Delete
    suspend fun delete(books : BookEntity)

}