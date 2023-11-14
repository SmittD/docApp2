package com.example.docapp2.data.local

import com.example.docapp2.database.DocDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(DocDatabase.Schema, "doc.db")
    }
}