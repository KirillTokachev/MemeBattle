package com.example.memebattle.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface MemeDao {

    @Query("SELECT * FROM meme")
    fun loadMemes(): LiveData<List<MemeDbModel>>

    @Insert(entity = MemeDbModel::class, onConflict = REPLACE)
    suspend fun saveMemes(meme: List<MemeDbModel>)
}