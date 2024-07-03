package com.example.polleriaappandroid

import android.app.Application
import androidx.room.Room

class ProductoApplication : Application() {

    companion object{
        lateinit var database: ProductoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this,
            ProductoDatabase::class.java,
            "ProductoDatabase")
            .build()
    }
}