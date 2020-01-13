package com.styledbylovee.zipcodevalidator.controller

import com.styledbylovee.zipcodevalidator.auth.User
import com.styledbylovee.zipcodevalidator.auth.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(@Autowired val userRepository: UserRepository) {

    @PostMapping("/addUser")
    fun addUser(@RequestBody user: User) {
        userRepository.save(user)
    }

}