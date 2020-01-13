package com.styledbylovee.zipcodevalidator.controller

import com.styledbylovee.zipcodevalidator.manager.ActiveZipCodeManager
import com.styledbylovee.zipcodevalidator.model.ActiveZipCode
import com.styledbylovee.zipcodevalidator.model.ZipCodeDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class ActiveZipCodeController(@Autowired val activeZipCodeManager: ActiveZipCodeManager) {

    @PostMapping(path = ["/addActiveZipCodes"])
    fun addActiveZipCodes(@RequestBody activeZipCode: ActiveZipCode) {
        activeZipCodeManager.addActiveZipCode(activeZipCode)
    }


    @PostMapping(path = ["/addActiveZipCodeList"])
    fun addActiveZipCodeList(@RequestBody zipCodes: List<Int>){
        activeZipCodeManager.addActiveZipCodeList(zipCodes)
    }


}