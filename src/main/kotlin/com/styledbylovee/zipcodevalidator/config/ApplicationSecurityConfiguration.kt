package com.styledbylovee.zipcodevalidator.config

import com.styledbylovee.zipcodevalidator.auth.ZipCodeValidatorUserDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager

@EnableWebSecurity
@Configuration
class ApplicationSecurityConfiguration : WebSecurityConfigurerAdapter() {
    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth?.authenticationProvider(authenticationProvider())
    }

    @Autowired
    lateinit var zipCodeValidatorUserDetailsService: ZipCodeValidatorUserDetailsService

    @Bean
    fun authenticationProvider(): DaoAuthenticationProvider {
        val provider = DaoAuthenticationProvider()
        provider.setUserDetailsService(zipCodeValidatorUserDetailsService)
        provider.setPasswordEncoder(BCryptPasswordEncoder(11))
        return provider
    }

    override fun configure(http: HttpSecurity?) {
        http?.csrf()?.disable()?.authorizeRequests()?.antMatchers("/addUser")?.permitAll()?.anyRequest()?.authenticated()?.and()?.httpBasic()
    }
}