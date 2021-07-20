package com.dimitrisligi.mvvmtestwithhiltandretrofit.util

interface MapperInterface<
        NetworkData, DomainData,
        NetworkModel, DomainModel,
        NetworkSupport, DomainSupport> {

    fun fromNetworkDataToDomainData(networkData: NetworkData): DomainData

    fun fromNetworkModelToDomainModel(networkModel: NetworkModel): DomainModel

    fun fromNetworkSupportToDomainSupport(networkSupport: NetworkSupport): DomainSupport
}