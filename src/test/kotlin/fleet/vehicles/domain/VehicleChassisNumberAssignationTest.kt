package fleet.vehicles.domain

import shared.domain.mothers.StringMother
import kotlin.test.Test
import kotlin.test.assertFailsWith

class VehicleChassisNumberAssignationTest {
    @Test
    fun it_should_accept_latin_alphanumeric_17_chars_long_value() {
        val stringLength = 17
        val chassisNumber = StringMother.createLatinAlphanumeric(stringLength)
        VehicleChassisNumber(chassisNumber)
    }

    @Test
    fun it_should_throw_exception_for_less_than_17_chars_long_value() {
        val stringLength = 16
        val chassisNumber = StringMother.createLatinAlphanumeric(stringLength)

        assertFailsWith<VehicleChassisNumberMalformedException> {
            VehicleChassisNumber(chassisNumber)
        }
    }

    @Test
    fun it_should_throw_exception_for_more_than_17_chars_long_value() {
        val stringLength = 18
        val chassisNumber = StringMother.createLatinAlphanumeric(stringLength)

        assertFailsWith<VehicleChassisNumberMalformedException> {
            VehicleChassisNumber(chassisNumber)
        }
    }

    @Test
    fun it_should_throw_exception_for_non_latin_alphanumeric_value() {
        val nonAlphanumericString = "!@#$%^&*()_+{}|?'"

        assertFailsWith<VehicleChassisNumberMalformedException> {
            VehicleChassisNumber(nonAlphanumericString)
        }
    }
}