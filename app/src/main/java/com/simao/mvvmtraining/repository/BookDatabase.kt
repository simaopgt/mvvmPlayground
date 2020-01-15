package com.simao.mvvmtraining.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import com.simao.mvvmtraining.model.BookEntity

@Database(entities = [BookEntity::class], version = 1)
abstract class BookDatabase: RoomDatabase() {

    abstract fun bookDao(): BookDAO
}