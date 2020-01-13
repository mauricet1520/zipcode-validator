package com.styledbylovee.zipcodevalidator.repository

import com.styledbylovee.zipcodevalidator.model.ActiveZipCode
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = "zipcodes", path = "zipcodes")
interface ActiveZipCodeRepository : CrudRepository<ActiveZipCode, String> {
    @RestResource(exported = false)
    override fun <S : ActiveZipCode?> save(entity: S): S {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @RestResource(exported = false)
    override fun deleteById(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @RestResource(exported = false)
    override fun deleteAll(entities: MutableIterable<ActiveZipCode>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @RestResource(exported = false)
    override fun deleteAll() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @RestResource(exported = false)
    override fun <S : ActiveZipCode?> saveAll(entities: MutableIterable<S>): MutableIterable<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @RestResource(exported = false)
    override fun delete(entity: ActiveZipCode) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}