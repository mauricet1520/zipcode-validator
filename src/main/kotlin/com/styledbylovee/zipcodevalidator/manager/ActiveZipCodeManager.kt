package com.styledbylovee.zipcodevalidator.manager

import com.styledbylovee.zipcodevalidator.model.ActiveZipCode
import com.styledbylovee.zipcodevalidator.repository.ActiveZipCodeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ActiveZipCodeManager(@Autowired val activeZipCodeRepository: ActiveZipCodeRepository) {

    fun addActiveZipCode(activeZipCode: ActiveZipCode) {
        activeZipCodeRepository.save(activeZipCode)
    }


    fun addActiveZipCodeList(zipCodes: List<Int>) {
        zipCodes.forEach {
            activeZipCodeRepository.save(ActiveZipCode(
                    id = it.toString(),
                    zipCode = it.toString(),
                    market = "Atlanta"))
        }
    }

}