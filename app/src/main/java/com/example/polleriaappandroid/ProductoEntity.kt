package com.example.polleriaappandroid

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ProductoEntity")
data class ProductoEntity(@PrimaryKey(autoGenerate = true) var id: Long = 0,
                          var name: String,
                          var phone: String = "",
                          var website: String = "",
                          var isFavorite: Boolean = false)
