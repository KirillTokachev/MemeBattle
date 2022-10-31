package com.example.memebattle.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "meme")
data class MemeDbModel(
    @PrimaryKey val memeID: Long,
    val imageMeme: String
)