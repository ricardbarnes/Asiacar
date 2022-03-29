package fleet.vehicles.domain

import shared.domain.mothers.StringMother
import shared.domain.StringTestTool
import kotlin.test.Test
import kotlin.test.assertFailsWith

internal class VehicleCategoryStringAssignationTest {
    @Test
    fun it_should_throw_an_exception_for_strings_longer_than_4() {
        val minLength = 5
        val maxLength = (minLength..256).random()
        val categoryString = StringMother.createLatinAlphanumeric(5, maxLength)

        assertFailsWith<VehicleCategoryStringMalformedException> {
            VehicleCategoryString(categoryString)
        }
    }

    @Test
    fun it_should_throw_an_exception_for_non_latin_alphanumeric_strings() {
        val stringLength = 4
        val categoryString = StringMother.createNonAlphanumeric(stringLength)

        assertFailsWith<VehicleCategoryStringMalformedException> {
            VehicleCategoryString(categoryString)
        }
    }

    @Test
    fun it_should_accept_acriss_code_format() {
        val randomCode1Char = StringTestTool.pickRandomCharacterFromString(VehicleCategoryString.IDX_1_CATEGORY_LETTERS)
        val randomCode2Char = StringTestTool.pickRandomCharacterFromString(VehicleCategoryString.IDX_2_TYPE_LETTERS)
        val randomCode3Char =
            StringTestTool.pickRandomCharacterFromString(VehicleCategoryString.IDX_3_TRANSMISSION_DRIVE_LETTERS)
        val randomCode4Char =
            StringTestTool.pickRandomCharacterFromString(VehicleCategoryString.IDX_4_FUEL_AIR_CONDITIONER_LETTERS)

        val codeString = "" + randomCode1Char + randomCode2Char + randomCode3Char + randomCode4Char

        VehicleCategoryString(codeString)
    }

    @Test
    fun it_should_throw_exception_for_non_acriss_code_formats() {
        val code1Char = StringTestTool.getRandomLatinCharacterNotInString(VehicleCategoryString.IDX_1_CATEGORY_LETTERS)
        val code2Char = StringTestTool.getRandomLatinCharacterNotInString(VehicleCategoryString.IDX_2_TYPE_LETTERS)
        val code3Char =
            StringTestTool.getRandomLatinCharacterNotInString(VehicleCategoryString.IDX_3_TRANSMISSION_DRIVE_LETTERS)
        val code4char =
            StringTestTool.getRandomLatinCharacterNotInString(VehicleCategoryString.IDX_4_FUEL_AIR_CONDITIONER_LETTERS)

        val codeString = "" + code1Char + code2Char + code3Char + code4char

        assertFailsWith<VehicleCategoryStringBadCodeException> {
            VehicleCategoryString(codeString)
        }
    }
}