package com.example.latihanarchitecturecomponent.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true) var id: Int?,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "priority") val priority: Int,
    @ColumnInfo(name = "description") val description: String
)
