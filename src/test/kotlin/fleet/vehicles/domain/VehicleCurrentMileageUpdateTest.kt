package fleet.vehicles.domain

import shared.domain.mothers.IntegerMother
import fleet.vehicles.domain.mothers.VehicleMother
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class VehicleCurrentMileageUpdateTest {

    @Test
    fun it_should_accept_a_positive_value() {
        val value = IntegerMother.createPositive()
        val vehicle = VehicleMother.create()

        vehicle.updateCurrentMileage(VehicleMileage(value))
    }

    @Test
    fun it_should_throw_an_exception_for_a_negative_value() {
        val value = IntegerMother.createNegative()
        val vehicle = VehicleMother.create()

        assertThrows<VehicleMileageIllegalArgumentException> {
            vehicle.updateCurrentMileage(VehicleMileage(value))
        }
    }
}