package com.dimitrisligi.mvvmtestwithhiltandretrofit.room

import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainData
import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainModel
import com.dimitrisligi.mvvmtestwithhiltandretrofit.domainmodel.DomainSupport
import com.dimitrisligi.mvvmtestwithhiltandretrofit.util.MapperInterface

class RoomMapper : MapperInterface<
        RoomDataCache, DomainData,
        RoomModelCache, DomainModel,
        RoomSupportCache, DomainSupport> {
    override fun fromEntityToDomainData(entityData: RoomDataCache): DomainData {
        return DomainData(
            id = entityData.id,
            avatar = entityData.avatar,
            email = entityData.email,
            firstname = entityData.firstname,
            lastname = entityData.lastname
        )
    }

    override fun fromDomainDataToEntityData(domainData: DomainData): RoomDataCache {
        return RoomDataCache(
            id = domainData.id,
            avatar = domainData.avatar,
            email = domainData.email,
            firstname = domainData.firstname,
            lastname = domainData.lastname
        )
    }

    override fun fromEntityModelToDomainModel(entityModel: RoomModelCache): DomainModel {
        return DomainModel(entityModel.domainModel.domainData, entityModel.domainSupport)
    }

    override fun fromDomainModelToEntityModel(domainModel: DomainModel): RoomModelCache {
        return RoomModelCache(domainModel, domainModel.domainSupport)
    }

    override fun fromEntitySupportToDomainSupport(entitySupport: RoomSupportCache): DomainSupport {
        return DomainSupport(text = entitySupport.text, url = entitySupport.url)
    }

    override fun fromDomainSupportToEntitySupport(domainSupport: DomainSupport): RoomSupportCache {
        return RoomSupportCache(text = domainSupport.text, url = domainSupport.url)
    }


    fun mapTheCache(entities: List<RoomModelCache>): List<DomainModel> {
        return entities.map { fromEntityModelToDomainModel(it) }
    }
}
