package com.styledbylovee.zipcodevalidator.auth

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class ZipCodeValidatorUserDetailsService(var userRepository: UserRepository): UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        val user = userRepository.findByUsername(username) ?: throw UsernameNotFoundException("cant find username")
        return ZipCodeValidatorUserPrincipal(user)
    }
}