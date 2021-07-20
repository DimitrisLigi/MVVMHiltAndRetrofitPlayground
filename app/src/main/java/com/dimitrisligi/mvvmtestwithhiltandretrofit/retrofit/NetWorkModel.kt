package com.dimitrisligi.mvvmtestwithhiltandretrofit.retrofit


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NetWorkModel(

    @SerializedName("networkData")
    @Expose
    val networkData: NetworkData,

    @SerializedName("networkSupport")
    @Expose
    val networkSupport: NetworkSupport
)