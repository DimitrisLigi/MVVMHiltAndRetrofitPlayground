package com.dimitrisligi.mvvmtestwithhiltandretrofit.retrofit

import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainData
import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainModel
import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainSupport
import com.dimitrisligi.mvvmtestwithhiltandretrofit.util.MapperInterface

class NetworkMapper : MapperInterface<
        NetworkData, DomainData,
        NetWorkModel, DomainModel,
        NetworkSupport, DomainSupport> {

    override fun fromEntityToDomainData(entityData: NetworkData): DomainData {
        return DomainData(
            id = entityData.id,
            avatar = entityData.avatar,
            email = entityData.email,
            firstname = entityData.firstname,
            lastname = entityData.lastname
        )
    }

    override fun fromDomainDataToEntityData(domainData: DomainData): NetworkData {
        return NetworkData(
            id = domainData.id,
            avatar = domainData.avatar,
            email = domainData.email,
            firstname = domainData.firstname,
            lastname = domainData.lastname
        )
    }

    override fun fromEntityModelToDomainModel(entityModel: NetWorkModel): DomainModel {
        return DomainModel(
            fromEntityToDomainData(entityData = entityModel.networkData),
            fromEntitySupportToDomainSupport(entitySupport = entityModel.networkSupport)
        )
    }

    override fun fromDomainModelToEntityModel(domainModel: DomainModel): NetWorkModel {
        return NetWorkModel(
            fromDomainDataToEntityData(domainData = domainModel.domainData),
            fromDomainSupportToEntitySupport(domainSupport = domainModel.domainSupport)
        )
    }

    override fun fromEntitySupportToDomainSupport(entitySupport: NetworkSupport): DomainSupport {
        return DomainSupport(text = entitySupport.text, url = entitySupport.url)
    }

    override fun fromDomainSupportToEntitySupport(domainSupport: DomainSupport): NetworkSupport {
        return NetworkSupport(text = domainSupport.text, url = domainSupport.url)
    }

    fun mapTheEntityList(entities: List<NetWorkModel>): List<DomainModel> {
        return entities.map { fromEntityModelToDomainModel(it) }
    }
}