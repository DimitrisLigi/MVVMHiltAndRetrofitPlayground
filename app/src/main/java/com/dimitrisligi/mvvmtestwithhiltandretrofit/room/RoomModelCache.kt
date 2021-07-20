package com.dimitrisligi.mvvmtestwithhiltandretrofit.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainModel
import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainSupport

@Entity(tableName = "model_table")
data class RoomModelCache(

    @ColumnInfo(name = "model")
    var domainModel: DomainModel,

    @ColumnInfo(name = "support")
    var domainSupport: DomainSupport
)
