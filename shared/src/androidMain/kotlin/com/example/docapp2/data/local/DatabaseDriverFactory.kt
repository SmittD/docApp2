package com.example.docapp2.data.local

import android.content.Context
import com.example.docapp2.data.dom.ReservationDataSource
import com.example.docapp2.database.DocDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver{
        return AndroidSqliteDriver(DocDatabase.Schema, context, "doc.db")
    }
}