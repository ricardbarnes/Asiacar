package fleet.vehicles.domain

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import shared.domain.mothers.StringMother

internal class VehicleLicensePlateAssignationTest {
    @Test
    fun it_should_accept_a_latin_alphanumeric_value() {
        val value = StringMother.createLatinAlphanumeric()
        VehicleLicensePlate(value)
    }

    @Test
    fun it_should_throw_an_exception_for_a_non_latin_alphanumeric_value() {
        val value = StringMother.createNonAlphanumeric()

        assertThrows<VehicleLicensePlateMalformedException> {
            VehicleLicensePlate(value)
        }
    }
}