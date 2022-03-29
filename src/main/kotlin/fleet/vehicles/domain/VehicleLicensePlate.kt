package fleet.vehicles.domain

import shared.domain.valueobjects.StringValueObject
import shared.domain.AlhpanumericLatinStringChecker

class VehicleLicensePlate(override val value: String) : StringValueObject() {
    init {
        if (!AlhpanumericLatinStringChecker.isAlphanumericLatin(value)) {
            throw VehicleLicensePlateMalformedException.throwBecauseOf(value)
        }
    }

    override fun getValue(): String {
        return this.value
    }
}