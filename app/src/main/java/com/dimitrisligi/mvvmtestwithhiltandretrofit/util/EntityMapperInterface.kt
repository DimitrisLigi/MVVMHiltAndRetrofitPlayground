package com.dimitrisligi.mvvmtestwithhiltandretrofit.util

interface EntityMapperInterface<
        UserFromNetwork, UserData,
        ModelFromNetwork, Model,
        SupportFromNetwork, Support> {

    fun fromUserNetworkToUserData(userFromNetwork: UserFromNetwork): UserData

    fun fromModelNetworkToModel(modelFromNetwork: ModelFromNetwork): Model

    fun fromSupportNetworkToSupport(supportFromNetwork: SupportFromNetwork): Support


}