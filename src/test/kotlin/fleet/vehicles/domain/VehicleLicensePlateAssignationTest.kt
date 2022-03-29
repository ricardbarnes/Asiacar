package fleet.vehicles.domain

import shared.domain.mothers.StringMother
import kotlin.test.Test
import kotlin.test.assertFailsWith

internal class VehicleLicensePlateAssignationTest {
    @Test
    fun it_should_accept_a_latin_alphanumeric_value() {
        val value = StringMother.createLatinAlphanumeric()
        VehicleLicensePlate(value)
    }

    @Test
    fun it_should_throw_an_exception_for_a_non_latin_alphanumeric_value() {
        val value = StringMother.createNonAlphanumeric()

        assertFailsWith<VehicleLicensePlateMalformedException> {
            VehicleLicensePlate(value)
        }
    }
}