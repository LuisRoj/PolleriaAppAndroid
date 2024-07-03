package com.example.polleriaappandroid

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(ProductoEntity::class), version = 1)
// version 1 porque se acaba de crear
abstract class ProductoDatabase : RoomDatabase() {
    abstract fun productoDao(): ProductoDao
}