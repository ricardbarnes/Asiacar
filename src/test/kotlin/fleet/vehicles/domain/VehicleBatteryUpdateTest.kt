package fleet.vehicles.domain

import shared.domain.mothers.IntegerMother
import fleet.vehicles.domain.mothers.VehicleMother
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class VehicleBatteryUpdateTest {

    @Test
    fun it_should_update_the_battery_with_a_positive_number() {
        val value = IntegerMother.createPositive(true)
        val vehicle = VehicleMother.create()

        vehicle.updateBatteryLevel(VehicleBatteryLevel(value))

        assertEquals(value, vehicle.getBatteryLevel().getValue())
    }

    @Test
    fun it_should_throw_an_exception_for_negative_values() {
        val value = IntegerMother.createNegative()
        val vehicle = VehicleMother.create()

        assertThrows<VehicleBatteryLevelIllegalArgumentException> {
            vehicle.updateBatteryLevel(VehicleBatteryLevel(value))
        }
    }
}