package com.styledbylovee.zipcodevalidator.auth

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RestResource

@RestResource(exported = false)
interface UserRepository : CrudRepository<User, String>{
    fun findByUsername(username: String?): User?
}