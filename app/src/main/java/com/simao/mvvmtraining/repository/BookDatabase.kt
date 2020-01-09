package com.simao.mvvmtraining.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.simao.mvvmtraining.model.BookEntity

@Database(entities = [BookEntity::class], version = 1)
abstract class BookDatabase: RoomDatabase() {

    abstract fun bookDao(): BookDAO

    companion object {

        private var INSTANCE: BookDatabase? = null

        fun getInstance(context: Context) : BookDatabase {

            val tempInstance = INSTANCE
            if(tempInstance != null) {
                return tempInstance
            }

            synchronized(BookDatabase::class) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BookDatabase::class.java,
                    "book_database"
                )
                    .build()

                INSTANCE = instance
                return instance

            }
        }
    }
}