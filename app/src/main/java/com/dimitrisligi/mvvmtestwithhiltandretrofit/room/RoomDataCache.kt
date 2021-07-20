package com.dimitrisligi.mvvmtestwithhiltandretrofit.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "data_table")
data class RoomDataCache(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "avatar")
    var avatar: String,

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo(name = "firstname")
    var firstname: String,

    @ColumnInfo(name = "lastname")
    var lastname: String
)
