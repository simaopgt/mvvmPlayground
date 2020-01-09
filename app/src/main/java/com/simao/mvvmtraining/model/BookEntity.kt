package com.simao.mvvmtraining.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_items")
data class BookEntity (@ColumnInfo(name = "title") var title: String) {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

}