package fleet.vehicles.domain

import shared.domain.mothers.IntegerMother
import fleet.vehicles.domain.mothers.VehicleMother
import kotlin.test.Test
import kotlin.test.assertFailsWith

internal class VehicleCurrentMileageUpdateTest {
    @Test
    fun it_should_accept_a_positive_value() {
        val value = IntegerMother.createPositive()
        val vehicle = VehicleMother.create();

        vehicle.updateCurrentMileage(VehicleMileage(value))
    }

    @Test
    fun it_should_throw_an_exception_for_a_negative_value() {
        val value = IntegerMother.createNegative()
        val vehicle = VehicleMother.create()

        assertFailsWith<VehicleMileageIllegalArgumentException> {
            vehicle.updateCurrentMileage(VehicleMileage(value))
        }
    }
}