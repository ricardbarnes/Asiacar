package shared.domain.mothers

import fleet.vehicles.domain.VehicleCategoryString

class StringMother {
    companion object {
        fun createLatinAlphanumeric(minLength: Int = 8, maxLength: Int = 32, allowSpaces: Boolean = false): String {
            val latinCharset = (('a'..'z') + ('A'..'Z') + ('0'..'9')).toMutableList()
            val length = (minLength..maxLength).random()

            if (allowSpaces) {
                latinCharset += ' '
            }

            return List(length) { latinCharset.random() }
                .joinToString("")
        }

        fun createNonAlphanumeric(minLength: Int = 8, maxLength: Int = 32): String {
            val symbolCharset = ("!@#$%^&*()_+{}|:?><-=[]\';/.,").toMutableList()
            val length = (minLength..maxLength).random()

            return List(length) { symbolCharset.random() }
                .joinToString("")
        }

        fun createLatinAlphanumeric(length: Int = 8): String {
            return createLatinAlphanumeric(length, length)
        }

        fun createNonAlphanumeric(minLength: Int = 8, maxLength: Int = 32, allowSpaces: Boolean = false): String {
            val symbolCharset = ("!@#$%^&*()_+{}|:?><[]\';/.,").toMutableList()
            val length = (minLength..maxLength).random()

            if (allowSpaces) {
                symbolCharset += ' '
            }

            return List(length) { symbolCharset.random() }
                .joinToString("")
        }

        fun createNonAlphanumeric(length: Int = 8): String {
            return createNonAlphanumeric(length, length)
        }

        fun createAcrissCode(): String {
            val firstLetter = VehicleCategoryString.IDX_1_CATEGORY_LETTERS.random()
            val secondLetter = VehicleCategoryString.IDX_2_TYPE_LETTERS.random()
            val thirdLetter = VehicleCategoryString.IDX_3_TRANSMISSION_DRIVE_LETTERS.random()
            val fourthLetter = VehicleCategoryString.IDX_4_FUEL_AIR_CONDITIONER_LETTERS.random()

            return "" + firstLetter + secondLetter + thirdLetter + fourthLetter
        }
    }
}