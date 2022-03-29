package fleet.vehicles.domain

import shared.domain.valueobjects.StringValueObject
import shared.domain.AlhpanumericLatinStringChecker

class VehicleCategoryString(override val value: String) : StringValueObject() {
    companion object {
        const val MIN_STRING_LENGTH = 1

        const val MAX_STRING_LENGTH = 4

        const val IDX_1_CATEGORY_LETTERS = "MNEHCDIJSRFGPULWOX"

        const val IDX_2_TYPE_LETTERS = "BCDWVLSTFJXPQZEMRHYNGK"

        const val IDX_3_TRANSMISSION_DRIVE_LETTERS = "MNCABD"

        const val IDX_4_FUEL_AIR_CONDITIONER_LETTERS = "RNDQHIECLSABMFVZUX"
    }

    init {
        if (
            value.length < MIN_STRING_LENGTH ||
            value.length > MAX_STRING_LENGTH ||
            !AlhpanumericLatinStringChecker.isAlphanumericLatin(value)
        ) {
            throw VehicleCategoryStringMalformedException.throwBecauseOf(value)
        }

        val letters = value.split("")
        val letter1 = letters[1]
        val letter2 = letters[2]
        val letter3 = letters[3]
        val letter4 = letters[4]

        if (
            !IDX_1_CATEGORY_LETTERS.contains(letter1, false) ||
            !IDX_2_TYPE_LETTERS.contains(letter2, false) ||
            !IDX_3_TRANSMISSION_DRIVE_LETTERS.contains(letter3, false) ||
            !IDX_4_FUEL_AIR_CONDITIONER_LETTERS.contains(letter4, false)
        ) {
            throw VehicleCategoryStringBadCodeException.throwBecauseOf(value)
        }
    }

    override fun getValue(): String {
        return this.value
    }
}