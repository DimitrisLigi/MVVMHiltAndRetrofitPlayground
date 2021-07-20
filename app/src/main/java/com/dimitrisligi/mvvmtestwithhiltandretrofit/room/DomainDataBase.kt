package com.dimitrisligi.mvvmtestwithhiltandretrofit.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        RoomDataCache::class,
        RoomModelCache::class,
        RoomSupportCache::class], version = 1
)
abstract class DomainDataBase : RoomDatabase() {
    abstract fun masterDao(): MasterDao
}