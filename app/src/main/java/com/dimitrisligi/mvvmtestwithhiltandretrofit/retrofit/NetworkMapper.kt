package com.dimitrisligi.mvvmtestwithhiltandretrofit.retrofit

import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainData
import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainModel
import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainSupport
import com.dimitrisligi.mvvmtestwithhiltandretrofit.util.MapperInterface

class NetworkMapper : MapperInterface<
        NetworkData, DomainData,
        NetWorkModel, DomainModel,
        NetworkSupport, DomainSupport> {

    override fun fromNetworkDataToDomainData(networkData: NetworkData): DomainData {
        return DomainData(
            id = networkData.id,
            avatar = networkData.avatar,
            email = networkData.email,
            firstname = networkData.firstName,
            lastname = networkData.lastName
        )
    }

    override fun fromNetworkModelToDomainModel(networkModel: NetWorkModel): DomainModel {
        return DomainModel(
            fromNetworkDataToDomainData(networkModel.networkData),
            fromNetworkSupportToDomainSupport(networkModel.networkSupport)
        )
    }

    override fun fromNetworkSupportToDomainSupport(networkSupport: NetworkSupport): DomainSupport {
        return DomainSupport(test = networkSupport.text, url = networkSupport.url)
    }
}