package com.dimitrisligi.mvvmtestwithhiltandretrofit.retrofit


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NetworkSupport(

    @SerializedName("text")
    @Expose
    val text: String,
    @SerializedName("url")
    @Expose
    val url: String
)