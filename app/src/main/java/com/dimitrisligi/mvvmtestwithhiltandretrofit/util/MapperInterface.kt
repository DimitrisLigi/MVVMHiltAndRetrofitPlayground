package com.dimitrisligi.mvvmtestwithhiltandretrofit.util


interface MapperInterface<
        EntityData, DomainData,
        EntityModel, DomainModel,
        EntitySupport, DomainSupport> {

    //DATA
    fun fromEntityToDomainData(entityData: EntityData): DomainData

    fun fromDomainDataToEntityData(domainData: DomainData): EntityData

    //MODEL
    fun fromEntityModelToDomainModel(entityModel: EntityModel): DomainModel

    fun fromDomainModelToEntityModel(domainModel: DomainModel): EntityModel


    //SUPPORT
    fun fromEntitySupportToDomainSupport(entitySupport: EntitySupport): DomainSupport

    fun fromDomainSupportToEntitySupport(domainSupport: DomainSupport): EntitySupport
}