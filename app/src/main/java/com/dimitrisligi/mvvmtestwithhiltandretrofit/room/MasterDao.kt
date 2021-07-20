package com.dimitrisligi.mvvmtestwithhiltandretrofit.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MasterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(modelEntity: RoomModelCache): Long

    @Query("SELECT * FROM model_table")
    suspend fun get(): List<RoomModelCache>
}