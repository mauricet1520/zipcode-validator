package com.styledbylovee.zipcodevalidator.auth

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
        @Id
        val userId: String,
        val username: String,
        val password: String
)