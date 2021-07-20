package com.dimitrisligi.mvvmtestwithhiltandretrofit.retrofit


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NetworkData(
    @SerializedName("avatar")
    @Expose
    val avatar: String,

    @SerializedName("email")
    @Expose
    val email: String,

    @SerializedName("first_name")
    @Expose
    val firstName: String,

    @SerializedName("id")
    @Expose
    val id: Int,

    @SerializedName("last_name")
    @Expose
    val lastName: String
)