package com.dimitrisligi.mvvmtestwithhiltandretrofit.retrofit

import retrofit2.http.GET

interface GettingNetworkEntitiesInterface {

    @GET("/api/users/2") //TODO Check if this is true
    suspend fun getNetworkEntities(): List<NetWorkModel>

}