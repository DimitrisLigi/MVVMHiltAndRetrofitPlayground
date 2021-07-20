package com.dimitrisligi.mvvmtestwithhiltandretrofit.room

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "support_table")
data class RoomSupportCache(
    @ColumnInfo(name = "text")
    var text: String,

    @ColumnInfo(name = "url")
    var url: String
)
