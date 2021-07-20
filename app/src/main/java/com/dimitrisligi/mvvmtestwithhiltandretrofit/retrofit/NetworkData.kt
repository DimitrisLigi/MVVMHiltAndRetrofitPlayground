package com.dimitrisligi.mvvmtestwithhiltandretrofit.retrofit


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NetworkData(
    @SerializedName("avatar")
    @Expose
    var avatar: String,

    @SerializedName("email")
    @Expose
    var email: String,

    @SerializedName("first_name")
    @Expose
    var firstName: String,

    @SerializedName("id")
    @Expose
    var id: Int,

    @SerializedName("last_name")
    @Expose
    var lastName: String
)