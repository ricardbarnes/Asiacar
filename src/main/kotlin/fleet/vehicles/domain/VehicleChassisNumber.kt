package fleet.vehicles.domain

import shared.domain.valueobjects.StringValueObject
import shared.domain.AlhpanumericLatinStringChecker

class VehicleChassisNumber(override val value: String) : StringValueObject() {
    companion object {
        const val CHASSIS_NUMBER_LENGTH = 17
    }

    init {
        if (
            value.length != CHASSIS_NUMBER_LENGTH ||
            !AlhpanumericLatinStringChecker.isAlphanumericLatin(value)
        ) {
            throw VehicleChassisNumberMalformedException.throwBecauseOf(value)
        }
    }

    override fun getValue(): String {
        return this.value
    }
}